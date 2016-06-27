package SimpleFactoryPattern.pro.factory;

import SimpleFactoryPattern.pro.annotation.Vehicle;
import SimpleFactoryPattern.pro.product.Car;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * http://www.jasongj.com/design_pattern/simple_factory/
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月12日
 */
public class CarFactory3 {
    private static final Logger LOG = LoggerFactory.getLogger(CarFactory3.class);

    private static Map<String, Class> allCars;

    static {
        Reflections reflections = new Reflections("SimpleFactoryPattern.pro.product");
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(Vehicle.class);
        allCars = new ConcurrentHashMap<String, Class>();
        for (Class<?> classObject : annotatedClasses) {
            Vehicle vehicle = (Vehicle) classObject.getAnnotation(Vehicle.class);
            allCars.put(vehicle.type(), classObject);
        }
        allCars = Collections.unmodifiableMap(allCars);
    }

    public static Car newCar() {
        Car car = null;
        String type = null;
        try {
            XMLConfiguration config = new XMLConfiguration("D://Program Files/wangting-xy/workspace/DesignPatterns/src/SimpleFactoryPattern/pro/car.xml");
            type = config.getString("factory3.type");
            LOG.info("car type is {}", type);
        } catch (ConfigurationException ex) {
            LOG.error("Parsing xml configuration file failed", ex);
        }

        if (allCars.containsKey(type)) {
            LOG.info("Created car type is {}", type);
            try {
                car = (Car) allCars.get(type).newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                LOG.error("Instantiate car failed", ex);
            }
        } else {
            LOG.error("specified car type {} does not exist", type);
        }
        return car;
    }
}

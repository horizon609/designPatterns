/**
 * 
 */
package SimpleFactoryPattern.pro.product;

import SimpleFactoryPattern.pro.annotation.Vehicle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月12日
 */
@Vehicle(type="BMW")
public class BMWCar extends Car {

private static Logger LOG = LoggerFactory.getLogger(BMWCar.class);
    
    public BMWCar() {
        this.name = "BMW";
    }

    @Override
    public void drive() {
        LOG.info("My name is {}. I'm on my way", name);
    };

}

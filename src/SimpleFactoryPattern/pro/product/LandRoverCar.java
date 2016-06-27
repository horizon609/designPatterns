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
@Vehicle(type="Land Rover")
public class LandRoverCar extends Car {

private static Logger LOG = LoggerFactory.getLogger(LandRoverCar.class);
    
    public LandRoverCar() {
        this.name = "Land Rover";
    }

    @Override
    public void drive() {
        LOG.info("My name is {}. I'm on my way", name);
    };

}

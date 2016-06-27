/**
 * 
 */
package SimpleFactoryPattern.pro.Client;

import SimpleFactoryPattern.pro.factory.CarFactory3;
import SimpleFactoryPattern.pro.product.Car;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月12日
 */
public class Driver5 {
    public static void main(String[] args) {
        Car car = CarFactory3.newCar();
        car.drive();
    }
}

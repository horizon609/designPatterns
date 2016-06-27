/**
 * 
 */
package SimpleFactoryPattern.pro.product;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月12日
 */
public abstract class Car {
protected String name;
    
    public abstract void drive();
    
    public String getName(){
        return this.name;
    }
}

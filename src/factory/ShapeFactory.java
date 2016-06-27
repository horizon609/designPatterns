/**
 * 
 */
package factory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public abstract class ShapeFactory {
    public abstract Shape factoryMethod(String shapeName);
    public void anOperation(String name ){
        Shape shape = factoryMethod(name);
        System.out.println("当前的形状是：" + shape.mName);
        shape.draw();
        shape.erase();
    }

}

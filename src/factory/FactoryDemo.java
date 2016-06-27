/**
 * 
 */
package factory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public class FactoryDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ShapeFactory s1 = new CircleFactory();
        ShapeFactory s2 = new SquareFactory();
        s1.anOperation("circle");
        s2.anOperation("square");
    }

}

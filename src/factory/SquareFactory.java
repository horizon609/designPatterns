/**
 * 
 */
package factory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public class SquareFactory extends ShapeFactory {

    /* (non-Javadoc)
     * @see factory.ShapeFactory#factoryMethod(java.lang.String)
     */
    @Override
    public Shape factoryMethod(String shapeName) {
        return new Square(shapeName + " created by SquareFactory");
    }

}

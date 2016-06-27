/**
 * 
 */
package factory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public class Square extends Shape {

    /**
     * @param name
     */
    public Square(String name) {
        super(name);
        
    }

    /* (non-Javadoc)
     * @see factory.Shape#draw()
     */
    @Override
    public void draw() {
        System.out.println("画了一个方块");
    }

    /* (non-Javadoc)
     * @see factory.Shape#erase()
     */
    @Override
    public void erase() {
        System.out.println("擦除了方块");
    }

}

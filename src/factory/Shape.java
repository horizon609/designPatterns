/**
 * 
 */
package factory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public abstract class Shape {
    public String mName;
    public abstract void draw();
    public abstract void erase();
    /**
     * 
     */
    public Shape(String name) {
        mName = name;
    }
    
}

/**
 * 
 */
package Decorator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class Sword implements Weapon {

    /* (non-Javadoc)
     * @see Decorator.Weapon#printInfo()
     */
    @Override
    public void printInfo() {
        System.out.println("一把长剑");
    }

}

/**
 * 
 */
package Decorator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class Critical extends WeaponDecorator {

    /**
     * @param sword
     */
    public Critical(Weapon weapon) {
        super(weapon);
    }
    
    /* (non-Javadoc)
     * @see Decorator.WeaponDecorator#printInfo()
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("有30%的几率造成致命一击");
    }

}

/**
 * 
 */
package Decorator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class Poison extends WeaponDecorator {

    /**
     * @param sword
     */
    public Poison(Weapon sword) {
        super(sword);
    }
    
    /* (non-Javadoc)
     * @see Decorator.WeaponDecorator#printInfo()
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("有50%几率造成中毒效果");
    }
}

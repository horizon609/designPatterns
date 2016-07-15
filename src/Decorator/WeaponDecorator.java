/**
 * 
 */
package Decorator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class WeaponDecorator implements Weapon {
    private Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }
    /* (non-Javadoc)
     * @see Decorator.Sword#printInfo()
     */
    @Override
    public void printInfo() {
        weapon.printInfo();
    }
    
}

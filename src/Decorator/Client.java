/**
 * 
 */
package Decorator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Weapon w = new Dazzle(new Critical(new Poison(new Sword())));
        w.printInfo();
    }

}

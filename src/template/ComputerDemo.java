/**
 * 
 */
package template;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public class ComputerDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AbstractComputer abc = new MilitaryComputer();
        abc.startUp();
    }
    

}

/**
 * 
 */
package bridge;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月12日
 */
public class Manual extends Transmission {

    /* (non-Javadoc)
     * @see bridge.Transmission#gear()
     */
    @Override
    public void gear() {
        System.out.println("手动挡");
    }

}

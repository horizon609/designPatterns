/**
 * 
 */
package bridge;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月12日
 */
public class BenZCar extends AbstractCar {

    /* (non-Javadoc)
     * @see bridge.AbstractCar#run()
     */
    @Override
    public void run() {
        gear.gear();
        System.out.println("Benz在跑..");
    }

}

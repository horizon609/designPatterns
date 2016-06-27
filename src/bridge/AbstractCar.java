/**
 * 
 */
package bridge;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月12日
 */
public abstract class AbstractCar {
    protected Transmission gear;
    public abstract void run();
    public void setTransmission(Transmission gear){
        this.gear = gear;
    }
}

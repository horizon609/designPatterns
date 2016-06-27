/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class AMDCpu implements CpuApi {
    private int pins;
    
    /**
     * 
     */
    public AMDCpu(int pins) {
        this.pins = pins;
    }

    /* (non-Javadoc)
     * @see AbstractFactory.CpuApi#calculate()
     */
    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数是：" + pins);
    }

}

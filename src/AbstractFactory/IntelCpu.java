/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class IntelCpu implements CpuApi {
    private int pins;

    /**
     * 
     */
    public IntelCpu(int pins) {
        this.pins = pins;
    }
    /* (non-Javadoc)
     * @see AbstractFactory.CpuApi#calculate()
     */
    @Override
    public void calculate() {
        System.out.println("Intel cpu的阵脚数是：" + pins);
    }

}

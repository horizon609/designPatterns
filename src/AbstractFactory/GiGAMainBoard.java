/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class GiGAMainBoard implements MainBoardApi {
    private int cpuHoles;
    /**
     * 
     */
    public GiGAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    /* (non-Javadoc)
     * @see AbstractFactory.MainBoardApi#installCpu()
     */
    @Override
    public void installCpu() {
        System.out.println("技嘉主板有针孔数：" + cpuHoles);
    }

}

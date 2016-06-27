/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class MSIMainBoard implements MainBoardApi {
    private int cpuHoles;
    /**
     * 
     */
    public MSIMainBoard(int cpuholes) {
        this.cpuHoles = cpuholes;
    }

    /* (non-Javadoc)
     * @see AbstractFactory.MainBoardApi#installCpu()
     */
    @Override
    public void installCpu() {
        System.out.println("MSI主板的针孔数：" + cpuHoles);
    }

}

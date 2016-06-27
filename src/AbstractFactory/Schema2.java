/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class Schema2 implements AbstractFactory {

    /* (non-Javadoc)
     * @see AbstractFactory.AbstractFactory#createCpu()
     */
    @Override
    public CpuApi createCpu() {
        return new AMDCpu(939);
    }

    /* (non-Javadoc)
     * @see AbstractFactory.AbstractFactory#createMainBoard()
     */
    @Override
    public MainBoardApi createMainBoard() {
        return new MSIMainBoard(939);
    }

}

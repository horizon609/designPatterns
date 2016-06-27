/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class Schema1 implements AbstractFactory {

    /* (non-Javadoc)
     * @see AbstractFactory.AbstractFactory#createCpu()
     */
    @Override
    public CpuApi createCpu() {
        return new IntelCpu(1156);
    }

    /* (non-Javadoc)
     * @see AbstractFactory.AbstractFactory#createMainBoard()
     */
    @Override
    public MainBoardApi createMainBoard() {
        return new GiGAMainBoard(1156);
    }

}

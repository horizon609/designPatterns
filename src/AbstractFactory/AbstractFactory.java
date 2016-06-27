/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public interface AbstractFactory {
    public CpuApi createCpu();
    public MainBoardApi createMainBoard();
}

/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class ComputerEnginee {
    private CpuApi cpu;
    private MainBoardApi mainBoard;

    public void initComputer(AbstractFactory schema){
        cpu = schema.createCpu();
        mainBoard = schema.createMainBoard();
        cpu.calculate();
        mainBoard.installCpu();
    }
}

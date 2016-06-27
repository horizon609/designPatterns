/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class MainBoardFactory {
    public static MainBoardApi createMainBoard(int type){
        MainBoardApi mainBoard = null;
        if(type == 1){
            mainBoard = new GiGAMainBoard(1156);
        }else if(type == 2){
            mainBoard = new MSIMainBoard(939);
        }
        return mainBoard;
        
    }

}

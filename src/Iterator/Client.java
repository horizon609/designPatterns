/**
 * 
 */
package Iterator;

import java.util.Arrays;
import java.util.List;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月29日
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Unit u1 = new Unit("路西法");
        Unit u2 = new Unit("卡尔");
        Unit u3 = new Unit("奈文摩尔");
        List<Unit> units = Arrays.asList(u1,u2,u3);
        Team<Unit> team = new Team<Unit>(units);
        while(team.getIterator().hasNext()){
            System.out.println(team.getIterator().next().getName());
        }
    }

}

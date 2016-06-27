/**
 * 
 */
package CommandPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月2日
 */
public class Macro {
    private final List actions;
    Map.Entry e;
    /**
     * 
     */
    public Macro() {
        actions = new ArrayList<>();
    }
    
    public void record(Action action){
        actions.add(action);
    }
    
    public void run(){
//        actions.forEach(Action::perform);
    }

}

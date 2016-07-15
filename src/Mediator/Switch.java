/**
 * 
 */
package Mediator;


/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public abstract class Switch {
    private boolean enable = true;
    private Director director;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Switch(Director director) {
        this.director = director;
    }
    
    public void trigger(){
        this.director.switchTriggered(this);
    }
    
    

}

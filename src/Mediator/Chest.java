/**
 * 
 */
package Mediator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class Chest extends Switch {
    private boolean isOpen;
    
    public boolean isOpen(){
        return isOpen;
    }

    /**
     * @param director
     */
    public Chest(Director director) {
        super(director);
        
    }
    
    public void open(){
        if(isEnable()){
            trigger();
            isOpen = true;
        }else{
            System.out.println("宝箱无法打开");
        }
    }

}

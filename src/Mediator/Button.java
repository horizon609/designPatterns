/**
 * 
 */
package Mediator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class Button extends Switch {
    private boolean isPush;
    public boolean isPush() {
        return isPush;
    }

    /**
     * @param director
     */
    public Button(Director director) {
        super(director);
        
    }
     public void push(){
         if(isEnable()){
             trigger();
             isPush = true;
         }else{
             System.out.println("按钮不可用！");
         }
     }
    

}

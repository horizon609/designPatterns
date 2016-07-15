/**
 * 
 */
package Mediator;
/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class RoomDirector implements Director {
    private Button blueButton;
    private Button redButon;
    private Chest chest;
    
    /* (non-Javadoc)
     * @see Mediator.Director#switchTriggered(Mediator.Switch)
     */
    @Override
    public void switchTriggered(Switch sw) {
       if(sw == blueButton){
           redButon.setEnable(false);
           chest.setEnable(true);
       }else if(sw == redButon){
           blueButton.setEnable(false);
           chest.setEnable(false);
       }else if(sw == chest){
           blueButton.setEnable(false);
           redButon.setEnable(true);
       }
    }

    public Button getBlueButton() {
        return blueButton;
    }
   
    public Button getRedButon() {
        return redButon;
    }

    public Chest getChest() {
        return chest;
    }

    public RoomDirector() {
        this.blueButton = new Button(this);
        this.redButon = new Button(this);
        this.chest = new Chest(this);
    }
}

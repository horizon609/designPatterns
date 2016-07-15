/**
 * 
 */
package Mediator;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月30日
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        RoomDirector r = new RoomDirector();
        r.getBlueButton().push();
        r.getRedButon().push();
        r.getChest().open();
    }

}

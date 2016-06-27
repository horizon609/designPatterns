/**
 * 
 */
package observer;

import java.util.Date;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月11日
 */
public class TieDaoBu extends Observable {
    private String mMessage;
    
    public TieDaoBu(String message){
        mMessage = message;
    }
    
    public void setMessage(String message){
        System.out.println("***************************");
        System.out.println(new Date() + "官方发布消息为：" + message);
        super.setChange();
        super.notifyObserver(message);
        mMessage = message;
    }

}

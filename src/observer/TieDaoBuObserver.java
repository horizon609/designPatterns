/**
 * 
 */
package observer;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月11日
 */
public class TieDaoBuObserver implements Observer{
    private String mName;
    /**
     * 
     */
    public TieDaoBuObserver(String name) {
        mName = name;
    }
    public void update(String message){
        System.out.println(mName + ": 官方发布新消息为：");
        System.out.println(message);
    }
}

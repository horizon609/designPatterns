/**
 * 
 */
package SimpleFactoryPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.test("Hello world!");
    }

}

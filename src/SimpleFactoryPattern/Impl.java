/**
 * 
 */
package SimpleFactoryPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class Impl implements Api {

    /* (non-Javadoc)
     * @see SimpleFactoryPattern.Api#test(java.lang.String)
     */
    @Override
    public void test(String str) {
        System.out.println(str);
    }

}

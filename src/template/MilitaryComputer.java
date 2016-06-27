/**
 * 
 */
package template;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public class MilitaryComputer extends AbstractComputer {
    /* (non-Javadoc)
     * @see template.AbstractComputer#hardwareCheck()
     */
    @Override
    protected void hardwareCheck() {
        System.out.println("需要防火墙检查");
    }

    /* (non-Javadoc)
     * @see template.AbstractComputer#login()
     */
    @Override
    protected void login() {
        System.out.println("需要指纹等高端的手段验证登陆");
    }
}

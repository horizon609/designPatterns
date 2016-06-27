/**
 * 
 */
package chainofresponsibility;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月10日
 */
public class Director extends Leader {

    /**
     * @param expenses
     */
    public Director() {
        super(5000);
        
    }

    /* (non-Javadoc)
     * @see chainofresponsibility.Leader#apply(chainofresponsibility.Programmer)
     */
    @Override
    public void apply(Programmer pro) {
        System.out.println(pro.getApply());
        System.out.println("项目主管爸：给给给");
    }

}

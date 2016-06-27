/**
 * 
 */
package chainofresponsibility;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月10日
 */
public class GroupLeader extends Leader {

    /**
     * @param expenses
     */
    public GroupLeader() {
        super(1000);
        
    }

    /* (non-Javadoc)
     * @see chainofresponsibility.Leader#apply(chainofresponsibility.Programmer)
     */
    @Override
    public void apply(Programmer pro) {
        System.out.println(pro.getApply());
        System.out.println("小组长爸：给给给");
    }

}

/**
 * 
 */
package chainofresponsibility;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月10日
 */
public abstract class Leader {
    private int mExpenses;
    private Leader mSuperiorLeader;
    
    public Leader(int expenses){
        mExpenses = expenses;
    }
    public void setSuperiorLeader(Leader mSuperiorLeader) {
        this.mSuperiorLeader = mSuperiorLeader;
    }
    public void handleRequest(Programmer pro){
        if(pro.getExpenses() < mExpenses){
            apply(pro);
        }else {
            if(mSuperiorLeader != null){
                mSuperiorLeader.handleRequest(pro);
            }else{
                System.out.println("no!!");
            }
        }
    }
    public abstract void apply(Programmer pro);
    

}

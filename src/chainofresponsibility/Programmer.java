/**
 * 
 */
package chainofresponsibility;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月10日
 */
public class Programmer {
    private int mExpenses;
    private String apply = "爸，我要钱= =";

    public Programmer(int mExpenses) {
        this.mExpenses = mExpenses;
    }

    public int getExpenses() {
        return mExpenses;
    }
    
    public String getApply(){
        return apply;
    }

}

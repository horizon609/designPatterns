/**
 * 
 */
package VisitorPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月1日
 */
public class ManagerEmployee extends Employee {
    private String mName;
    private int mTimeSheet;
    private double mWage;
    private int mPunishmentTime;
    
    public ManagerEmployee(String name, int timeSheet, double wage, int punishmentTime){
        this.mName = name;
        this.mTimeSheet = timeSheet;
        this.mWage = wage;
        this.mPunishmentTime = punishmentTime;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmTimeSheet() {
        return mTimeSheet;
    }

    public void setmTimeSheet(int mTimeSheet) {
        this.mTimeSheet = mTimeSheet;
    }

    public double getmWage() {
        return mWage;
    }

    public void setmWage(double mWage) {
        this.mWage = mWage;
    }

    public int getmPunishmentTime() {
        return mPunishmentTime;
    }

    public void setmPunishmentTime(int mPunishmentTime) {
        this.mPunishmentTime = mPunishmentTime;
    }

    /* (non-Javadoc)
     * @see VisitorPattern.Employee#accept(VisitorPattern.Department)
     */
    @Override
    public void accept(Department d) {
        d.visit(this);
    }

    /* (non-Javadoc)
     * @see VisitorPattern.Employee#getTotalWage()
     */
    @Override
    public double getTotalWage() {
        return mWage - 10 * mPunishmentTime;
    }

}

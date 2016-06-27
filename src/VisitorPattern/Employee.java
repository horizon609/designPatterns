/**
 * 
 */
package VisitorPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月1日
 */
public abstract class Employee {
    public abstract void accept(Department d);
    public abstract double getTotalWage();

}

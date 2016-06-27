/**
 * 
 */
package VisitorPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月1日
 */
public abstract class Department {
    public abstract void visit(ManagerEmployee e);
    public abstract void visit(GeneralEmployee e);
}

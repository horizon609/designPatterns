/**
 * 
 */
package FactoryMethod;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月17日
 */
public interface IDaoFactory {
    IUserDao createUserDao();

}

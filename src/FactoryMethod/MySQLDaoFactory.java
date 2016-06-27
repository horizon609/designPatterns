/**
 * 
 */
package FactoryMethod;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月17日
 */
public class MySQLDaoFactory implements IDaoFactory {

    /* (non-Javadoc)
     * @see FactoryMethod.IDaoFactory#createUserDao()
     */
    @Override
    public IUserDao createUserDao() {
        return new MySQLUserDao();
    }

}

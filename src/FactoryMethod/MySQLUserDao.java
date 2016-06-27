/**
 * 
 */
package FactoryMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月17日
 */
public class MySQLUserDao implements IUserDao{

    /* (non-Javadoc)
     * @see FactoryMethod.IUserDao#addUser(FactoryMethod.User)
     */
    private static final Logger LOG = LoggerFactory.getLogger(MySQLUserDao.class);
    @Override
    public void addUser(User user) {
        LOG.info("MySQL added user {}", user);
    }

    /* (non-Javadoc)
     * @see FactoryMethod.IUserDao#removeUser(FactoryMethod.User)
     */
    @Override
    public void removeUser(User user) {
        LOG.info("MySQL remove user {}", user);
    }

    /* (non-Javadoc)
     * @see FactoryMethod.IUserDao#getUser(java.lang.String)
     */
    @Override
    public User getUser(String name) {
        return new User(name);
    }

}

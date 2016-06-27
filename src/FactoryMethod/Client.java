/**
 * 
 */
package FactoryMethod;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月17日
 */
public class Client {
    public static void main(String[] args) {
        IDaoFactory factory = new MySQLDaoFactory();
        IUserDao userDao = factory.createUserDao();
        User wt = new User("wt");
        char [] c = {'1','2','3'};
        wt.setPassword(c);
        userDao.addUser(wt);
        userDao.getUser("wt");
    }

}

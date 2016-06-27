/**
 * 
 */
package FactoryMethod;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月17日
 */

public class User {
    private String mUserName;
    private char[] mPassword;
    
    public User(String username){
        mUserName = username;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        this.mUserName = userName;
    }
    
    public void setPassword(char[] password) {
        this.mPassword = password;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "{username:" + mUserName + ", password:" + new String(mPassword) +"}"; 
    }
    
    

}

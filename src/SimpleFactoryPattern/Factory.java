/**
 * 
 */
package SimpleFactoryPattern;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class Factory {
    @Deprecated
    public static Api createApiOld(){
        return new Impl();
    }
    
    public static Api createApi(){
        Properties properties = new Properties();  
        InputStream in = null;  
        try {  
            in = Factory.class.getResourceAsStream("factory.properties");  
            properties.load(in);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally {  
            try {  
                in.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        Api api = null;
            try {
                api = (Api)Class.forName(properties.getProperty("ImplClass")).newInstance();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        return api;
    }

}

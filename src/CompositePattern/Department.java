/**
 * 
 */
package CompositePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public class Department extends Organization {

    /**
     * @param name
     */
    public Department(String name) {
        super(name);
        
    }
    private static Logger LOGGER = LoggerFactory.getLogger(Department.class);
    /* (non-Javadoc)
     * @see CompositePattern.Organization#inform(java.lang.String)
     */
    @Override
    public void inform(String info) {
        LOGGER.info("{}-{}",info,getName());
    }

}

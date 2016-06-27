/**
 * 
 */
package CompositePattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public class Company extends Organization {
    private static Logger LOGGER = LoggerFactory.getLogger(Company.class);

    /**
     * @param name
     */
    public Company(String name) {
        super(name);
        
    }

    /* (non-Javadoc)
     * @see CompositePattern.Organization#inform()
     */
    @Override
    public void inform(String info) {
        LOGGER.info("{}-{}",info,getName());
        List<Organization> allOrgs = getAllOrg();
        allOrgs.forEach(org -> org.inform(info));
    }

}

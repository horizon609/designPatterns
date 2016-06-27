/**
 * 
 */
package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月27日
 */
public class Concreate implements ISubject {

    /* (non-Javadoc)
     * @see proxy.ISubject#action()
     */
    private Logger LOG = LoggerFactory.getLogger(Concreate.class);
    @Override
    public void action() {
        LOG.info("do it");
    }

}

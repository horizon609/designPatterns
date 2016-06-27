/**
 * 
 */
package proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月27日
 */
public class Proxy implements ISubject {
    private ISubject c;
    /**
     * 
     */
 public Proxy() {
        c = new Concreate(); 
    }

    /* (non-Javadoc)
     * @see proxy.ISubject#action()
     */
    private Logger LOG = LoggerFactory.getLogger(Proxy.class);
    @Override
    public void action() {
        if(new Random().nextBoolean()){
            LOG.info("permission deny");
        }else {
            c.action();
        }
    }

}

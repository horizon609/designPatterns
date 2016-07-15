/**
 * 
 */
package Memento;

import FactoryMethod.MySQLUserDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年7月15日
 */
public class Client {
    private static final Logger LOG = LoggerFactory.getLogger(Client.class);        

    /**
     * @param args
     */
    public static void main(String[] args) {
        Player player = new Player(10, "篝火1");
        LOG.info("打古达前 {}", player);
        //坐篝火
        Caretaker caretaker = new Caretaker();
        caretaker.setmMemento(player.createMemento());
        //打古达
        player.setPosition("古达的住处");
        player.usePotion();
        LOG.info("打古达的过程中{}",player);
        //输了，读档
        player.restoreMemento(caretaker.getmMemento());
        LOG.info("打完古达后 {}",player);
    }

}

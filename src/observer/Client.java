/**
 * 
 */
package observer;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月11日
 */
public class Client {
    public static void main(String[] args) {
        TieDaoBu tie = new TieDaoBu("温州火车出轨体现了我国高铁世界技术水平领先，和谐社会和谐号出事了");
        TieDaoBuObserver o1 = new TieDaoBuObserver("媒体A");
        TieDaoBuObserver o2 = new TieDaoBuObserver("屁民B");
        TieDaoBuObserver o3 = new TieDaoBuObserver("日本韩国嘲笑者C");
        tie.addObserver(o1);
        tie.addObserver(o2);
        tie.addObserver(o3);
        
        tie.setMessage("搜救结束，经生命探测仪发现没有生命迹象");
        tie.setMessage("搜救结束了，还发现了一名2岁的女孩，真是奇迹");
        tie.setMessage("35一个神奇的数字,动车相撞35人死亡,河南平顶山矿难35人死亡," +
                "重庆暴雨35人死亡,云南大雨35人死亡。" +
                "为什么死亡人数控制在36人以内？" +
                "超过36人市委书记级别的要撤职，所以一开始发生就注定了死亡人数不会超过36。" +
                "而事实上,我在查看国外报纸报道," +
                "华尔街日报说,这次动车事故,其中有47人死亡,200余人受伤");
        
    }
    

}

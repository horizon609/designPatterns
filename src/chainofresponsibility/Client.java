/**
 * 
 */

package chainofresponsibility;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月10日
 */
public class Client {
    public static void main(String[] args) {
        Programmer pro = new Programmer((int) (Math.random() * 30000));
        
        Leader groupLeader = new GroupLeader();
        Leader director = new Director();
        Leader manager = new Manager();
        Leader boss = new Boss();
        
        groupLeader.setSuperiorLeader(director);
        director.setSuperiorLeader(manager);
        manager.setSuperiorLeader(boss);
        
        groupLeader.handleRequest(pro);
    }
}

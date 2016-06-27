/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ComputerEnginee com = new ComputerEnginee();
        AbstractFactory schema1 = new Schema1();
        com.initComputer(schema1);
        AbstractFactory schema2 = new Schema2();
        com.initComputer(schema2);
    }

}

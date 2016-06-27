/**
 * 
 */
package bridge;

/**
 * http://www.jasongj.com/design_pattern/bridge/?utm_source=tuicool&utm_medium=referral
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月12日
 */
public class BridgeClient {
    public static void main(String[] args) {
        BMWCar bmw = new BMWCar();
        Transmission traAuto = new Auto();
        bmw.setTransmission(traAuto);
        bmw.run();
        
        BenZCar benz = new BenZCar();
        Transmission traManual = new Manual();
        benz.setTransmission(traManual);
        benz.run();
        
        
    }

}

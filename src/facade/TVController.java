/**
 * 
 */
package facade;

/**
 * Facade:外观模式（门面模式）
 * 参考：https://github.com/horizon609/android_design_patterns_analysis/tree/master/facade/elsdnwn
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public class TVController {

    private PowerSystem mPowerSystem = new PowerSystem();
    private ChannelSystem mChannelSystem = new ChannelSystem();
    private VoiceSystem mVoiceSystem = new VoiceSystem();
    
    public void powerOn(){
        mPowerSystem.powerOn();
    }
    
    public void powerOff(){
        mPowerSystem.powerOff();
    }
    
    public void turnUp(){
        mVoiceSystem.turnUp();
    }
    
    public void turnDown(){
        mVoiceSystem.turnDown();
    }

    public void next(){
        mChannelSystem.next();
    }
    
    public void prev(){
        mChannelSystem.prev();
    }
    
    public static void main(String[] args) {
        TVController tvcontroller = new TVController();
        tvcontroller.powerOn();
        tvcontroller.next();
        tvcontroller.turnUp();
        tvcontroller.powerOff();
    }
}

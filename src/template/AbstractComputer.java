/**
 * 
 */
package template;

/**
 * 模板模式，目前我项目里的Solution和QikuSolution都是继承了TemplateSolution
 * https://github.com/horizon609/android_design_patterns_analysis/tree/master/template-method/mr.simple
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月6日
 */
public abstract class AbstractComputer {
    protected void powerOn(){
        System.out.println("开启电源");
    }
    
    protected void hardwareCheck(){
        System.out.println("硬件检查");
    }
    
    protected void loadSystem(){
        System.out.println("载入操作系统");
    }
    
    protected void login(){
        System.out.println("小白的电脑无需验证,直接进入操作系统");
    }
    
    /**
     * 启动电脑方法, 步骤固定为开启电源、系统检查、加载操作系统、用户登录。该方法为final， 防止算法框架被覆写.
     */
   public final void startUp(){
       powerOn();
       hardwareCheck();
       loadSystem();
       login();
   }
    

}

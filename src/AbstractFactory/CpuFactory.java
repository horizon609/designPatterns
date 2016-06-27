/**
 * 
 */
package AbstractFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月19日
 */
public class CpuFactory {
    public static CpuApi createCpu(int type){
        CpuApi cpu = null;
        if(type == 1){
            cpu = new IntelCpu(1156);
        }else if(type == 2){
            cpu = new AMDCpu(939);
        }
        return cpu;
    }

}

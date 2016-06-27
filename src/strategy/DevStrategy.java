/**
 * 
 */
package strategy;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年4月28日
 */
public class DevStrategy implements Strategy {

    public double calc(double a, double b){
        if(b == 0){
            throw new IllegalArgumentException("除数不能为0");
        }
        return a / b;
    }

    
    
}

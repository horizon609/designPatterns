/**
 * 
 */
package strategy;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年4月28日
 */
public class SubStrategy implements Strategy{
    public double calc(double a, double b){
        return a - b;
    }
}

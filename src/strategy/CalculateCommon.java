/**
 * 
 */
package strategy;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年4月28日
 */
public class CalculateCommon {
    public static double calc(String s, double a, double b){
        if(s.equals("+")){
            return a + b;
        }else if(s.equals("-")){
            return a - b;
        }else if(s.equals("*")){
            return a * b;
        }else if(s.equals("/")){
            return a / b;
        }else {
            throw new IllegalArgumentException("输入参数错误");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(CalculateCommon.calc("-", 7, 3.5));
    }

}

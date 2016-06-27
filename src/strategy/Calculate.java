/**
 * 
 */
package strategy;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年4月28日
 */
public class Calculate {
//    private Strategy mStrategy;
//    /**
//     * 
//     */
//    public Calculate(Strategy strategy) {
//        this.mStrategy = strategy;
//    }
    private Strategy strategy;
    
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double culc(double a,double b){
        if(strategy == null){
            throw new IllegalStateException("未设置计算策略");
        }
        return strategy.calc(a, b);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Calculate cal = new Calculate();
        cal.setStrategy(new AddStrategy());
        System.out.println(cal.culc(4.2, 3.7));
    }

}

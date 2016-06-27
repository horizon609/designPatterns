/**
 * 
 */
package Decorator;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * 旨在说明Decorator（包装者）模式以及复合优于继承的地方
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年4月26日
 */
public class InstrumentHashSet<E> extends ForwordingSet<E> {
    private int addCount = 0;

    /**
     * @param s
     */
    public InstrumentHashSet(Set<E> s) {
        super(s);
    }
    
    /* (non-Javadoc)
     * @see DesignPatterns.ForwordingSet#add(java.lang.Object)
     */
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    
    /* (non-Javadoc)
     * @see DesignPatterns.ForwordingSet#addAll(java.util.Collection)
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
    
    public int getAddCount(){
        return addCount;
    }

    /**
     * 这次的输出结果正确了，是3，一开始我很疑惑。为什么没有调用到本类的add中去。调试跟了一下发现它调的是HashSet的add，这并不难理解。毕竟传进去构造器的是一个HashSet,这样一来就会调hashtab的add。因为并没有覆盖
     * @param args
     */
    public static void main(String[] args) {
        Set<String> hs1 = new HashSet<String>();
        InstrumentHashSet<String> ins = new InstrumentHashSet<String>(hs1);
        ins.addAll(Arrays.asList("aaa","bbb","ccc"));
        System.out.println(ins.getAddCount());
        System.out.println(hs1.toString());
    }

}

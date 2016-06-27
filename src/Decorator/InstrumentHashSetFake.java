/**
 * 
 */
package Decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @param <E>
 * @date 2016年4月26日
 */
public class InstrumentHashSetFake<E> extends HashSet<E>{
    private int addCount = 0;
    /**
     * 
     */
    public InstrumentHashSetFake() {
    }
    
    /* (non-Javadoc)
     * @see java.util.HashSet#add(java.lang.Object)
     */
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    
    /* (non-Javadoc)
     * @see java.util.AbstractCollection#addAll(java.util.Collection)
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
     * 显示的结果为6,因为调用addAll时，掉进了父类AbstractCollection的addAll中，其中调用了add.由于继承的关系则调了本类的add方法
     * @param args
     */
    public static void main(String[] args) {
        InstrumentHashSetFake<String> ins = new InstrumentHashSetFake<String>();
        ins.addAll(Arrays.asList("add","bbb","ccc"));
        System.out.println(ins.getAddCount());
        System.out.println(ins.toString());
    }

}

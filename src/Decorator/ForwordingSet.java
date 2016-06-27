/**
 * 
 */
package Decorator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * 这个类叫做转发类，把Set接口里的方法都包装了一下
 * @author echoplex_x email:wangting-xy@360.cn
 * @param <E>
 * @date 2016年4月26日
 */
public class ForwordingSet<E> implements Set<E>{
    private final Set<E> s;
    
   
    public ForwordingSet(Set<E> s) {
        this.s = s;
    }

    /* (non-Javadoc)
     * @see java.util.Set#size()
     */
    @Override
    public int size() {
        return s.size();
    }

    /* (non-Javadoc)
     * @see java.util.Set#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    /* (non-Javadoc)
     * @see java.util.Set#contains(java.lang.Object)
     */
    @Override
    public boolean contains(Object o) {
        return s.contains(o);
    }

    /* (non-Javadoc)
     * @see java.util.Set#iterator()
     */
    @Override
    public Iterator<E> iterator() {
        return s.iterator();
    }

    /* (non-Javadoc)
     * @see java.util.Set#toArray()
     */
    @Override
    public Object[] toArray() {
        return s.toArray();
    }

    /* (non-Javadoc)
     * @see java.util.Set#toArray(java.lang.Object[])
     */
    @Override
    public <T> T[] toArray(T[] a) {
        return s.toArray(a);
    }

    /* (non-Javadoc)
     * @see java.util.Set#add(java.lang.Object)
     */
    @Override
    public boolean add(E e) {
        return s.add(e); 
    }

    /* (non-Javadoc)
     * @see java.util.Set#remove(java.lang.Object)
     */
    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    /* (non-Javadoc)
     * @see java.util.Set#containsAll(java.util.Collection)
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return s.containsAll(c);
    }

    /* (non-Javadoc)
     * @see java.util.Set#addAll(java.util.Collection)
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        return s.addAll(c);
    }

    /* (non-Javadoc)
     * @see java.util.Set#retainAll(java.util.Collection)
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        return s.retainAll(c);
    }

    /* (non-Javadoc)
     * @see java.util.Set#removeAll(java.util.Collection)
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        return s.retainAll(c);
    }

    /* (non-Javadoc)
     * @see java.util.Set#clear()
     */
    @Override
    public void clear() {
        s.clear();
    }

}

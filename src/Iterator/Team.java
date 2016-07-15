/**
 * 
 */
package Iterator;

import java.util.List;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @param <T>
 * @date 2016年6月29日
 */
public class Team<T> {

    private List<T> members;
    int cursor;
    public Iterator<T> getIterator(){
        return new Iterator<T>() {

            @Override
            public T next() {
                T result = members.get(cursor);
                cursor++;
                return result;
            }

            @Override
            public boolean hasNext() {
                return cursor < members.size();
            }
        };
    }
    public Team(List<T> members) {
        super();
        this.members = members;
    }
}

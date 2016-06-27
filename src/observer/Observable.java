/**
 * 
 */

package observer;

import java.util.Vector;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月11日
 */
public class Observable {
    private boolean mChange;
    private Vector obs;

    public Observable(){
        obs = new Vector();
    }
    
    public void setChange() {
        mChange = true;
    }

    public void clearChange() {
        mChange = false;
    }

    public boolean hasChange() {
        return mChange;
    }

    public void addObserver(Observer o) {
        if (o == null) {
            throw new NullPointerException();
        }
        if (!obs.contains(o)) {
            obs.addElement(o);
        }

    }

    public void deleteObserver(Object obj) {
        obs.remove(obj);
    }

    public void deleteObserver() {
        obs.removeAllElements();
    }

    public void notifyObserver() {
        notifyObserver(null);
    }

    public void notifyObserver(String s) {
        Object[] arrObject;
        // 考虑并发
        synchronized (this) {
            if (!hasChange()) {
                return;
            }
            arrObject = obs.toArray();
            clearChange();
        }
        for (int i = 0; i < arrObject.length; i++) {
            ((Observer) arrObject[i]).update(s);
        }
    }

    public int countObserver() {
        return obs.size();
    }

}

/**
 * 
 */
package Memento;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年7月15日
 */
public class Caretaker {
    private IMemento mMemento;

    public IMemento getmMemento() {
        return mMemento;
    }

    public void setmMemento(IMemento mMemento) {
        this.mMemento = mMemento;
    }
}

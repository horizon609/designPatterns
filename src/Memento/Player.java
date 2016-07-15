/**
 * 
 */
package Memento;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年7月15日
 */
public class Player {
    private int potion;//药剂数量
    private String position;//玩家所在位置
    
    public Player(int potion, String position) {
        this.potion = potion;
        this.position = position;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public void move(String other_place){
        position = other_place;
    }
    
    public int usePotion(){
        return --potion;
    }
    
    private class Memento implements IMemento{
        private int potion;
        private String position;
        public Memento(int potion, String position) {
            this.potion = potion;
            this.position = position;
        }
        
        public int getPotion(){
            return potion;
        }
        
        public String getPosition(){
            return position;
        }
    }
    
    public IMemento createMemento(){
        return new Memento(getPotion(), getPosition());
    }
    
    public void restoreMemento(IMemento memento){
        setPotion(((Memento)memento).getPotion());
        setPosition(((Memento)memento).getPosition());
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "{身上的药剂余量：" + getPotion() + ", 所处的位置：" + getPosition() + "}";
    }

}

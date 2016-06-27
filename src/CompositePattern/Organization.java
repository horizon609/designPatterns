/**
 * 
 */
package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public abstract class Organization {
    private String name;
    private List<Organization> childOrg = new ArrayList<Organization>();
    
    /**
     * 
     */
    public Organization(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void addOrg(Organization org){
        childOrg.add(org);
    }
   
    public void removeOrg(Organization org){
        childOrg.remove(org);
    }
    
    public List<Organization> getAllOrg(){
        return childOrg;
    }
    
    abstract public void inform(String info);
}

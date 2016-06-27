/**
 * 
 */
package CompositePattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Organization shCompany = new Company("shCompany"); 
        Organization shHR = new Department("shHR");
        Organization shFinance = new Department("shFinance");
        Organization shAdmin = new Department("shAdmin");
        
        Organization bjCompany = new Company("bjCompany"); 
        Organization bjHR = new Department("bjHR");
        Organization bjFinance = new Department("bjFinance");
        Organization bjAdmin = new Department("bjAdmin");
        
        Organization company = new Company("Company"); 
        Organization hr = new Department("HR");
        Organization finance = new Department("Finance");
        Organization admin = new Department("Admin");
        
        company.addOrg(shCompany);
        company.addOrg(bjCompany);
        company.inform("cheer");
        shCompany.addOrg(shAdmin);
        shCompany.addOrg(bjFinance);
        shCompany.inform("test");
    }

}

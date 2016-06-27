/**
 * 
 */

package VisitorPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * http://blog.csdn.net/janice0529/article/details/41151987?utm_source=tuicool&utm_medium=referral
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月1日
 */
public class Client {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        GeneralEmployee e1 = new GeneralEmployee("wt", 10, 14900, 0);
        GeneralEmployee e2 = new GeneralEmployee("wyj", 12, 13000, 0);
        GeneralEmployee e3 = new GeneralEmployee("ww", 10, 13000, 0);
        ManagerEmployee e4 = new ManagerEmployee("zc", 8, 20000, 3);
        ManagerEmployee e5 = new ManagerEmployee("wl", 5, 30000, 10);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
//        FADepartment fa = new FADepartment();
        HRDepartment hr = new HRDepartment();
        for(Employee e: employeeList){
//            e.accept(fa);
            e.accept(hr);
        }
    }
}

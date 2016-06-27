/**
 * 
 */
package VisitorPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月1日
 */
public class HRDepartment extends Department {
    private Logger LOG = LoggerFactory.getLogger(HRDepartment.class);

    /* (non-Javadoc)
     * @see VisitorPattern.Department#visit(VisitorPattern.ManagerEmployee)
     */
    @Override
    public void visit(ManagerEmployee e) {
        LOG.info("管理者：{}, 工作时长：{}", e.getmName(),e.getmTimeSheet());
    }

    /* (non-Javadoc)
     * @see VisitorPattern.Department#visit(VisitorPattern.GeneralEmployee)
     */
    @Override
    public void visit(GeneralEmployee e) {
        LOG.info("普通员工：{}, 工作时长：{}", e.getmName(),e.getmTimeSheet());
    }

}

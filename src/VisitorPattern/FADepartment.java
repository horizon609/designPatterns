/**
 * 
 */
package VisitorPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 财政部门
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月1日
 */
public class FADepartment extends Department {

    /* (non-Javadoc)
     * @see VisitorPattern.Department#visit(VisitorPattern.Employee)
     */
    private Logger LOG = LoggerFactory.getLogger(FADepartment.class);
    
    @Override
    public void visit(GeneralEmployee e) {
        LOG.info("管理者： {}, 固定工资： {}, 实发工资: {}, 迟到时长：{}", e.getmName(),e.getmWage(),e.getTotalWage(),e.getmPunishmentTime());
    }

    /* (non-Javadoc)
     * @see VisitorPattern.Department#visit(VisitorPattern.Employee)
     */
    @Override
    public void visit(ManagerEmployee e) {
        LOG.info("普通员工： {}, 固定工资： {}, 实发工资: {}, 迟到时长：{}", e.getmName(),e.getmWage(),e.getTotalWage(),e.getmPunishmentTime());
    }

}

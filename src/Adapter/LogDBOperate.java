/**
 * 
 */
package Adapter;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public class LogDBOperate implements LogDBOperateApi {

    /* (non-Javadoc)
     * @see Adapter.LogDBOperateApi#addDBLog()
     */
    @Override
    public void addDBLog() {
        System.out.println("向数据库加入log");
    }

    /* (non-Javadoc)
     * @see Adapter.LogDBOperateApi#getDBLog()
     */
    @Override
    public void getDBLog() {
        System.out.println("从数据库获取log");
    }

    /* (non-Javadoc)
     * @see Adapter.LogDBOperateApi#removeDBLog()
     */
    @Override
    public void removeDBLog() {
        System.out.println("从数据库删除log");
    }

}

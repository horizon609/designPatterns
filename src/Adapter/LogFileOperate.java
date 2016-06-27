/**
 * 
 */
package Adapter;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public class LogFileOperate implements LogFileOperateApi {

    /* (non-Javadoc)
     * @see Adapter.LogFileOperateApi#addFileLog()
     */
    @Override
    public void addFileLog() {
        System.out.println("从文件加入log");
    }

    /* (non-Javadoc)
     * @see Adapter.LogFileOperateApi#getFileLog()
     */
    @Override
    public void getFileLog() {
        System.out.println("从文件读取log");
    }

    /* (non-Javadoc)
     * @see Adapter.LogFileOperateApi#removeFileLog()
     */
    @Override
    public void removeFileLog() {
        System.out.println("从文件删除log");
    }

}

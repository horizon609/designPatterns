/**
 * 
 */
package Adapter;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public class Adapter implements LogFileOperateApi {
    private LogDBOperateApi logDBOperateApi;
    /**
     * 
     */
    public Adapter(LogDBOperateApi log) {
        this.logDBOperateApi = log;
    }

    /* (non-Javadoc)
     * @see Adapter.LogFileOperateApi#addFileLog()
     */
    @Override
    public void addFileLog() {
        logDBOperateApi.addDBLog();
    }

    /* (non-Javadoc)
     * @see Adapter.LogFileOperateApi#getFileLog()
     */
    @Override
    public void getFileLog() {
        logDBOperateApi.getDBLog();
    }

    /* (non-Javadoc)
     * @see Adapter.LogFileOperateApi#removeFileLog()
     */
    @Override
    public void removeFileLog() {
        logDBOperateApi.removeDBLog();
    }

}

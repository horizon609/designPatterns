/**
 * 
 */
package Adapter;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年5月25日
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LogFileOperateApi logFileOperate = new LogFileOperate();
        logFileOperate.addFileLog();
        logFileOperate.getFileLog();
        logFileOperate.removeFileLog();
        
        Adapter adapter = new Adapter(new LogDBOperate());
        adapter.addFileLog();
        adapter.getFileLog();
        adapter.removeFileLog();
    }

}

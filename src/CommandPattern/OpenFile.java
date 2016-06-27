/**
 * 
 */
package CommandPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月2日
 */
public class OpenFile implements Action {
    private FileSystemReceiver fileSystem;
    
    /**
     * 
     */
    public OpenFile(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    /* (non-Javadoc)
     * @see CommandPattern.Action#perform()
     */
    @Override
    public void perform() {
        fileSystem.openFile();
    }

}

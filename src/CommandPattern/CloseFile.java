/**
 * 
 */
package CommandPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月2日
 */
public class CloseFile implements Action {
    private FileSystemReceiver fileSystem;
    
    /**
     * 
     */
    public CloseFile(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    /* (non-Javadoc)
     * @see CommandPattern.Action#perform()
     */
    @Override
    public void perform() {
        fileSystem.closeFile();
    }

}

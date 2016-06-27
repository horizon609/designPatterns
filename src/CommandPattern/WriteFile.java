/**
 * 
 */
package CommandPattern;

/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月2日
 */
public class WriteFile implements Action{
    private FileSystemReceiver fileSystem;

    public WriteFile(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    /* (non-Javadoc)
     * @see CommandPattern.Action#perform()
     */
    @Override
    public void perform() {
        fileSystem.writeFile();
    }

}

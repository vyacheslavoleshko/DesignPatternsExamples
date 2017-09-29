/**
 * @author Viacheslav Oleshko
 */
public class SecurityProxy implements IFileSystemUtil{
    private IFileSystemUtil fileSystemUtil;
    private String password;

    public SecurityProxy(String password) {
        this.password = password;
        fileSystemUtil = new FileSystemUtil();
    }

    @Override
    public void renameFile() {
        fileSystemUtil.renameFile();
    }

    @Override
    public void removeAllFromYourHardDrive_ಠ_ಠ() {
        if (password.equals("qwerty")) {
            fileSystemUtil.removeAllFromYourHardDrive_ಠ_ಠ();
        } else {
            System.out.println("Wrong password!");
        }
    }
}

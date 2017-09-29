/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        // Wrong password
        IFileSystemUtil proxyWrongPassword = new SecurityProxy("admin");
        proxyWrongPassword.renameFile();
        proxyWrongPassword.removeAllFromYourHardDrive_ಠ_ಠ();

        System.out.println("________________________");

        // Correct password
        IFileSystemUtil proxyCorrectPassword = new SecurityProxy("qwerty");
        proxyCorrectPassword.renameFile();
        proxyCorrectPassword.removeAllFromYourHardDrive_ಠ_ಠ();
    }
}

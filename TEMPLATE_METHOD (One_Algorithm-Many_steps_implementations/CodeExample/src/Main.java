/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        AndroidCoding androidCoding = new AndroidCoding();
        EnterpriseCoding enterpriseCoding = new EnterpriseCoding();

        androidCoding.createSoftware();
        System.out.println("________________________");
        enterpriseCoding.createSoftware();
    }
}

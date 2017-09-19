/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        Image proxy = new BigImageProxy();
        // Loading image
        proxy.display();

        // Use loaded image
        proxy.display();
    }
}

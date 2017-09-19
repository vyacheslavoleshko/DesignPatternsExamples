/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        BrandNewRectangle rectangle = new BrandNewRectangle(new LegacyRectangle());
        rectangle.draw(0, 1, 2, 3);
    }
}

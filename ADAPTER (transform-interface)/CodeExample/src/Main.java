/**
 * Now we can invoke method defined in Rectangle interface, but inside the method call to BrandNewRectangle will
 * be performed
 *
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new RectangleAdapter(new BrandNewRectangle());
        rectangle.drawOldRectangle(2, 3, 2, 3);
    }
}

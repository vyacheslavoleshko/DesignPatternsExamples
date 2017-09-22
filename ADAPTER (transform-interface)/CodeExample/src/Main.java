import java.util.Arrays;

/**
 * Now we can invoke method defined in Rectangle interface, but inside the method call to BrandNewRectangle will
 * be performed
 *
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        Rectangle newRectangle = new RectangleAdapter(new BrandNewRectangle());
        Rectangle oldRectangle = new LegacyRectangle();

        Rectangle[] rectangles = {newRectangle, oldRectangle};
        Arrays.stream(rectangles).forEach(r -> r.drawOldRectangle(2, 3, 2, 3));
    }
}

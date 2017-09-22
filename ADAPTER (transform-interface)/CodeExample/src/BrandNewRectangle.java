/**
 * This is cool and shiny BrandNewRectangle class that can draw rectangles with special effects: shadowing, highlighting...
 * But it has DIFFERENT interface than LegacyRectangle. This class needs coordinates of upper left and down right corners!
 *
 * @author Viacheslav Oleshko
 */
public class BrandNewRectangle {

    public void drawBrandNewRectangle(int x1, int y1, int x2, int y2) {
        System.out.println("Draw brand new rectangle with special effects!");
        System.out.println(String.format(
                "Drawing rectangle: " +
                        "x1: %s, " +
                        "y1: %s, " +
                        "x2: %s, " +
                        "y2: %s", x1, y1, x2, y2));
    }
}

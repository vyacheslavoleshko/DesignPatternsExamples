/**
 * Legacy class, that can draw rectangle. All our code uses this class to draw rectangles.
 * This rectangle needs coordinates of left upper corner and width and height.
 *
 * @author Viacheslav Oleshko
 */
public class LegacyRectangle implements Rectangle {
    public void drawOldRectangle(int upperLeftX, int upperLeftY, int width, int height) {
        System.out.println(String.format(
                "Drawing old boring rectangle: " +
                "left corner X: %s, " +
                "left corner Y: %s, " +
                "width: %s, " +
                "height: %s", upperLeftX, upperLeftY, width, height));
    }
}

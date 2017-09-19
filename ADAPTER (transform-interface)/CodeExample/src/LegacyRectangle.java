/**
 * Legacy class, that can draw rectangle. That is what we need, but now we want other interface.
 *
 * This rectangle needs coordinates of left upper corner and width and height.
 * But we want to pass upper left and down right corner coordinates to draw rectangle!
 *
 * @author Viacheslav Oleshko
 */
public class LegacyRectangle {
    public void draw(int upperLeftX, int upperLeftY, int width, int height) {
        System.out.println(String.format(
                "Drawing rectangle: " +
                "left corner X: %s, " +
                "left corner Y: %s, " +
                "width: %s, " +
                "height: %s", upperLeftX, upperLeftY, width, height));
    }
}

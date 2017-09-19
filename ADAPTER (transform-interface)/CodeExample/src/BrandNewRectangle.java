/**
 * This is Adapter class. It tries to make two interfaces compatible with each other.
 * Inside Adapter we just call methods of the adaptee (LegacyRectangle)
 *
 * @author Viacheslav Oleshko
 */
public class BrandNewRectangle {
    private LegacyRectangle legacyRectangle;

    public BrandNewRectangle(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    public void draw(int x1, int y1, int x2, int y2) {
        int upperLeftX = Math.min(x1, x2);
        int upperLeftY = Math.min(y1, y2);
        int width = Math.abs(x1 - x2);
        int height = Math.abs(y1 - y2);
        legacyRectangle.draw(upperLeftX, upperLeftY, width, height);
    }
}

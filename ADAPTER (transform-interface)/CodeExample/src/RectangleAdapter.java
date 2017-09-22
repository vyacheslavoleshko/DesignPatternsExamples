/**
 * This is Adapter class. It tries to make two interfaces compatible with each other.
 * Adapter implements target interface of LegacyRectangle, so our project code can work with old interface.
 * But inside Adapter we call methods of the adaptee (BrandNewRectangle)!
 *
 * @author Viacheslav Oleshko
 */
public class RectangleAdapter implements Rectangle {
    private BrandNewRectangle brandNewRectangle;

    public RectangleAdapter(BrandNewRectangle brandNewRectangle) {
        this.brandNewRectangle = brandNewRectangle;
    }

    @Override
    public void drawOldRectangle(int upperLeftX, int upperLeftY, int width, int height) {
        int x1 = upperLeftX;
        int y1 = upperLeftY;
        int x2 = upperLeftX + width;
        int y2 = upperLeftY - height;
        brandNewRectangle.drawBrandNewRectangle(x1, y1, x2, y2);
    }
}

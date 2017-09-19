/**
 * @author Viacheslav Oleshko
 */
public class Circle implements Shape{
    private int x;
    private int y;
    private int radius;
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Drawing circle: " +
                "x = %s, " +
                "y = %s, " +
                "radius = %s, " +
                "color = %s", x, y, radius, color));
    }
}

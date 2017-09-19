/**
 * Visitor interface
 *
 * @author Viacheslav Oleshko
 */
public interface GeometryCalculator {
    void calc(Point2D point);
    void calc(Point3D point);
}

/**
 * Concrete visitor
 *
 * @author Viacheslav Oleshko
 */
public class EuclidCalculator implements GeometryCalculator {
    @Override
    public void calc(Point2D point) {
        System.out.println(String.format(
                "Calculate metrics using Euclid geometry for %s", point.getClass()));
        point.setMetrics("Euclid metric for 2D");
    }

    @Override
    public void calc(Point3D point) {
        System.out.println(String.format(
                "Calculate metrics using Euclid geometry for %s", point.getClass()));
        point.setMetrics("Euclid metric for 3D");
    }
}

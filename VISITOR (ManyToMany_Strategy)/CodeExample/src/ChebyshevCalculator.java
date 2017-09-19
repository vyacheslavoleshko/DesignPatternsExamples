/**
 * Concrete visitor
 *
 * @author Viacheslav Oleshko
 */
public class ChebyshevCalculator implements GeometryCalculator {
    @Override
    public void calc(Point2D point) {
        System.out.println(String.format(
                "Calculate metrics using Chebyshev geometry for %s", point.getClass()));
        point.setMetrics("Chebyshev metric for 2D");
    }
    @Override
    public void calc(Point3D point) {
        System.out.println(String.format(
                "Calculate metrics using Chebyshev geometry for %s", point.getClass()));
        point.setMetrics("Chebyshev metric for 3D");
    }
}

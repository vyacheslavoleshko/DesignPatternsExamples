/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        Point point2D = new Point2D();
        Point point3D = new Point3D();
        EuclidCalculator euclidCalculator = new EuclidCalculator();
        ChebyshevCalculator chebyshevCalculator = new ChebyshevCalculator();

        // accept Euclid Calculator to 2D & 3D points
        point2D.accept(euclidCalculator);
        System.out.println(point2D.getMetrics());

        point3D.accept(new EuclidCalculator());
        System.out.println(point3D.getMetrics());


        // accept Chebyshev Calculator to 2D & 3D points
        point2D.accept(chebyshevCalculator);
        System.out.println(point2D.getMetrics());

        point3D.accept(chebyshevCalculator);
        System.out.println(point3D.getMetrics());
    }
}

/**
 * @author Viacheslav Oleshko
 */
public class Point2D extends Point {


    @Override
    public void accept(GeometryCalculator calculator) {
        calculator.calc(this);
    }
}

/**
 * @author Viacheslav Oleshko
 */
public abstract class Point {
    int x;
    int y;
    private String metrics;

    public String getMetrics() {
        return metrics;
    }

    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }

    public abstract void accept(GeometryCalculator calculator);

}

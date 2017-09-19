import java.util.HashMap;

/**
 * Works as a cache of Flyweights (circles)
 *
 * Factory method getCircle takes argument that represents SHARED property of Flyweight. In this example
 * we will cache all circles that have same color. For example, we can have only 5 Circle objects representing 5 colored
 * circles, but millions of their usages to invoke draw() method inside a loop without creating additional objects
 * (just get them from the cache)
 *
 * @author Viacheslav Oleshko
 */
public class CircleFactory {
    private static final HashMap<String, Circle> flyweightCache = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = flyweightCache.get(color);

        if (circle == null) {
            circle = new Circle(color);
            flyweightCache.put(color, circle);
        }
        return circle;
    }
}

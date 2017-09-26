/**
 * Receiver class knows HOW to perform tasks
 *
 * @author Viacheslav Oleshko
 */
public class Receiver {
    public void getSum(int a, int b) {
        System.out.println(a + b);
    }

    public void getSquare(int a) {
        System.out.println(Math.pow((double) a, 0.5));
    }
}

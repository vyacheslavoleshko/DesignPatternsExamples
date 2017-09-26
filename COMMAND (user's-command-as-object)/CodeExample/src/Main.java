/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Calculator calculator = new Calculator();
        calculator.calc(new PlusCommand(receiver, 3, 4));  // 7
        calculator.calc(new SquareCommand(receiver, 4));      // 2.0
    }
}

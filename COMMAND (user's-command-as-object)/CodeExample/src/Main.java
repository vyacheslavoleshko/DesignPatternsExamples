/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        ArithmeticCalculationPerformer receiver = new ArithmeticCalculationPerformer();
        Calculator calculator = new Calculator();
        calculator.calc(new PlusCommand(receiver, 3, 4));
        calculator.calc(new SquareCommand(receiver, 4));
    }
}

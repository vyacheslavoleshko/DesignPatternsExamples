/**
 * @author Viacheslav Oleshko
 */
public class SquareCommand implements Command {
    private ArithmeticCalculationPerformer calculator;
    private int a;

    public SquareCommand(ArithmeticCalculationPerformer calculator, int a) {
        this.calculator = calculator;
        this.a = a;
    }

    @Override
    public void execute() {
        calculator.getSquare(a);
    }
}

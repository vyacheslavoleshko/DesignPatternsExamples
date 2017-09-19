/**
 * @author Viacheslav Oleshko
 */
public class PlusCommand implements Command{
    private ArithmeticCalculationPerformer calculator;
    private int a;
    private int b;

    public PlusCommand(ArithmeticCalculationPerformer calculator, int a, int b) {
        this.calculator = calculator;
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        calculator.getSum(a, b);
    }
}


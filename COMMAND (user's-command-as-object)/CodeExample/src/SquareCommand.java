/**
 * @author Viacheslav Oleshko
 */
public class SquareCommand implements Command {
    private Receiver receiver;
    private int a;

    public SquareCommand(Receiver calculator, int a) {
        this.receiver = calculator;
        this.a = a;
    }

    @Override
    public void execute() {
        receiver.getSquare(a);
    }
}

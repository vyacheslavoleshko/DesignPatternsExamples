/**
 * @author Viacheslav Oleshko
 */
public class PlusCommand implements Command{
    private Receiver receiver;
    private int a;
    private int b;

    public PlusCommand(Receiver rec, int a, int b) {
        this.receiver = rec;
        this.a = a;
        this.b = b;
    }

    @Override
    public void execute() {
        receiver.getSum(a, b);
    }
}



/**
 * @author Viacheslav Oleshko
 */
public class Calculator {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void calc(Command command) {
        command.execute();
    }
}

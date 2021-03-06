/**
 * @author Viacheslav Oleshko
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(SeverityLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("ERROR_LOGGER: " + message);
    }
}

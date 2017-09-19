/**
 * @author Viacheslav Oleshko
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(SeverityLevel level) {
        this.severityLevel = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG_LOGGER: " + message);
    }
}

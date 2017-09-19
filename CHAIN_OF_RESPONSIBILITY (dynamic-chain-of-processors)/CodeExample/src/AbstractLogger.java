/**
 * @author Viacheslav Oleshko
 */
public abstract class AbstractLogger {
    private AbstractLogger nextLoggerInChain;
    protected SeverityLevel severityLevel;

    public AbstractLogger linkWith(AbstractLogger nextLoggerInChain) {
        this.nextLoggerInChain = nextLoggerInChain;
        return nextLoggerInChain;
    }

    public void logMessage(SeverityLevel messageSeverityLevel, String message) {
        if (this.severityLevel.getLevelAsInt() <= messageSeverityLevel.getLevelAsInt()) {
            write(message);
        }

        // check if this is not the end of the chain
        if (nextLoggerInChain != null) {
            // delegate message logging to the next logger
            nextLoggerInChain.logMessage(messageSeverityLevel, message);
        }
    }

    protected abstract void write(String message);
}

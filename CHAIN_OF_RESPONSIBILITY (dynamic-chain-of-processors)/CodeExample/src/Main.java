
/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static AbstractLogger createChainOfLoggers() {
        AbstractLogger chainOfLoggers = new ErrorLogger(SeverityLevel.ERROR);
        AbstractLogger debugLog =       new DebugLogger(SeverityLevel.DEBUG);
        AbstractLogger infoLog  =       new InfoLogger (SeverityLevel.INFO);

        chainOfLoggers
            .linkWith(debugLog)
            .linkWith(infoLog);

        return chainOfLoggers;
    }

    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = createChainOfLoggers();
        chainOfLoggers.logMessage(SeverityLevel.INFO,  "Info Message");
        chainOfLoggers.logMessage(SeverityLevel.DEBUG, "Debug Message");
        chainOfLoggers.logMessage(SeverityLevel.ERROR, "Error Message");
    }
}

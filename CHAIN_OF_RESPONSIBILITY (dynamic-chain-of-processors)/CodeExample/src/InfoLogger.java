/**
 * @author Viacheslav Oleshko
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(SeverityLevel level) {
        this.severityLevel = level;
    }

    @Override
    protected void write(String messsage) {
        System.out.println("INFO_LOGGER: " + messsage);
    }
}

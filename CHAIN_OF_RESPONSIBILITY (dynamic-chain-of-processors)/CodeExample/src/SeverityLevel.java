/**
 * @author Viacheslav Oleshko
 */
public enum SeverityLevel {
    INFO (0),
    DEBUG(1),
    ERROR(2);

    private int level;

    SeverityLevel(int level) {
        this.level = level;
    }

    public int getLevelAsInt() {
        return this.level;
    }
}

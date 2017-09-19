/**
 * Archiver that can implement different algorithms of archiving.
 * Type of algorithm to be used is defined at runtime
 *
 * @author Viacheslav Oleshko
 */
public class Archiver {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void archive(String filePath) {
        strategy.archive(filePath);
    }
}

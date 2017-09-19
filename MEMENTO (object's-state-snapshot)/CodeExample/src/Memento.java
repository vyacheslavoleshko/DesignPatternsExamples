/**
 * Class to hold the state
 *
 * @author Viacheslav Oleshko
 */
public class Memento {
    private String state;

    public Memento(String message) {
        this.state = message;
    }

    public String getState() {
        return this.state;
    }
}

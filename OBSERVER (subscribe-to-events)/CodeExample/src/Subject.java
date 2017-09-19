/**
 * Interface for class that observers want to subscribe
 *
 * @author Viacheslav Oleshko
 */
public interface Subject {
    void attachObserver(Observer observer);
    void changeState(String state);
    String getState();
}

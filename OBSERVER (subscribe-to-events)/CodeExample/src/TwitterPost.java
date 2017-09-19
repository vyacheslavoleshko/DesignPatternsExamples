import java.util.ArrayList;
import java.util.List;

/**
 * @author Viacheslav Oleshko
 */
public class TwitterPost implements Subject {
    private String twitt;
    private List<Observer> subscribers = new ArrayList<>();

    TwitterPost(String twitt) {
        this.twitt = twitt;
    }

    @Override
    public void attachObserver(Observer subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void changeState(String changedTwitt) {
        this.twitt = changedTwitt;
        notifySubscribers();
    }

    @Override
    public String getState() {
        return twitt;
    }

    private void notifySubscribers() {
        for (Observer subscriber : subscribers) {
            subscriber.getNotification();
        }
    }
}

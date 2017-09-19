/**
 * Class that represents business object. We need to have an ability to make a snapshot of its state and restore it
 * if needed (make UNDO or REDO operations with it). For example - we have deal with forum message
 * and try to we are modifying it. Need to have an ability to undo changes of messages
 *
 * @author Viacheslav Oleshko
 */
public class Originator {
    private String state = "";

    // field that we do not want to keep its state
    private String signature;

    public void setState(String state) {
        System.out.println(String.format("Originator: Setting state to %s", state));
        this.state = state;
    }

    public Memento save() {
        System.out.println(String.format("Originator: Saving state (message = %s) to Memento", this.state));
        return new Memento(state);
    }

    public void restore(Memento memento) {
        String restoredState = memento.getState();
        System.out.println(String.format("Originator: Restoring state to %s", restoredState));
        this.state = restoredState;
    }

    public String getState() {
        return this.state;

    }
}

/**
 * Class that represents business object. We need to have an ability to make a snapshot of its msg and restore it
 * if needed (make UNDO or REDO operations with it). For example - we have deal with forum message
 * and try to we are modifying it. Need to have an ability to undo changes of messages
 *
 * @author Viacheslav Oleshko
 */
public class ForumMessage {
    private String msg = "";

    public void setMsg(String msg) {
        System.out.println(String.format("ForumMessage: Setting msg to %s", msg));
        this.msg = msg;
    }

    public Memento save() {
        System.out.println(String.format("ForumMessage: Saving msg (message = %s) to Memento", this.msg));
        return new Memento(msg);
    }

    public void restore(Memento memento) {
        String restoredState = memento.getState();
        System.out.println(String.format("ForumMessage: Restoring msg to %s", restoredState));
        this.msg = restoredState;
    }

    public String getMsg() {
        return this.msg;

    }
}

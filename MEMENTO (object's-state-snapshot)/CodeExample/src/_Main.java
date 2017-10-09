/**
 * _Main method
 *
 * @author Viacheslav Oleshko
 */

public class _Main {
    public static void main(String[] args) {
        ForumMessage forumMessage = new ForumMessage();
        CareTaker careTaker = new CareTaker();

        forumMessage.setMsg("State_1");
        forumMessage.setMsg("State_2");

        careTaker.addMemento(forumMessage.save());

        forumMessage.setMsg("State_3");

        careTaker.addMemento(forumMessage.save());

        forumMessage.setMsg("State_4");
        forumMessage.restore(careTaker.getMemento());

        System.out.println("Current state:" + forumMessage.getMsg());

        forumMessage.restore(careTaker.getMemento());

        System.out.println("Current state:" + forumMessage.getMsg());
    }
}

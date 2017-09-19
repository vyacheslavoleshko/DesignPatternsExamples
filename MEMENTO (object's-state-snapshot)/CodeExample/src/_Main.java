/**
 * _Main method
 *
 * @author Viacheslav Oleshko
 */

public class _Main {
    public static void main(String[] args) {
        Originator forumMessage = new Originator();
        CareTaker careTaker = new CareTaker();

        forumMessage.setState("State_1");
        forumMessage.setState("State_2");

        careTaker.addMemento(forumMessage.save());

        forumMessage.setState("State_3");

        careTaker.addMemento(forumMessage.save());

        forumMessage.setState("State_4");
        forumMessage.restore(careTaker.getMemento());

        System.out.println("Current state:" + forumMessage.getState());

        forumMessage.restore(careTaker.getMemento());

        System.out.println("Current state:" + forumMessage.getState());
    }
}

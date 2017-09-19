import java.util.Stack;

/**
 * Class to hold Mementos
 *
 * @author Viacheslav Oleshko
 */
public class CareTaker {
    private Stack<Memento> memntos = new Stack<>();

    public void addMemento(Memento memento) {
        System.out.println("CareTaker: adding Memento");
        memntos.push(memento);
    }

    public Memento getMemento() {
        System.out.println("CareTaker: retrieving Memento");
       return memntos.pop();
    }
}

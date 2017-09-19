/**
 * @author Viacheslav Oleshko
 */
public class SwitchOnState implements IState {

    @Override
    public void doAction() {
        System.out.println("Switched on!");
    }
}

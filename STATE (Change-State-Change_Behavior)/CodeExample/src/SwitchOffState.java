/**
 * @author Viacheslav Oleshko
 */
public class SwitchOffState implements IState {

    @Override
    public void doAction() {
        System.out.println("Switched off!");
    }
}

/**
 * If button pushed, and we are in switchedOffState, need to switch on TV!
 *
 * @author Viacheslav Oleshko
 */
public class SwitchOffState implements IState {
    private Tv tv;

    public SwitchOffState(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void pushButton() {
        System.out.println("TV switched on!");
        tv.setState(tv.switchOnState);
    }
}

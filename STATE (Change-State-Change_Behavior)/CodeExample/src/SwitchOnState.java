/**
 * If button pushed, and we are in switchedOnState, need to switch off TV!
 *
 * @author Viacheslav Oleshko
 */
public class SwitchOnState implements IState {
    private Tv tv;

    public SwitchOnState(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void pushButton() {
        System.out.println("TV switched off!");
        tv.setState(tv.switchOffState);
    }
}

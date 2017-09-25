/**
 * @author Viacheslav Oleshko
 */
public class Tv {
    IState switchOffState;
    IState switchOnState;
    private IState state;

    public Tv() {
        this.switchOffState = new SwitchOffState(this);
        this.switchOnState = new SwitchOnState(this);
        state = switchOffState;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void pushButton() {
        this.state.pushButton();
    }
}

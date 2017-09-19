/**
 * @author Viacheslav Oleshko
 */
public class TvRemoteControl implements IState{
    private IState state;

    public void setState(IState state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}

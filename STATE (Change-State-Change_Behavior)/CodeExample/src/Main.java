/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        SwitchOnState switchOn = new SwitchOnState();
        SwitchOffState switchOff = new SwitchOffState();

        TvRemoteControl remoteControl = new TvRemoteControl();

        remoteControl.setState(switchOff);
        remoteControl.doAction();

        remoteControl.setState(switchOn);
        remoteControl.doAction();
    }
}

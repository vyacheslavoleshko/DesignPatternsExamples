/**
 * @author Viacheslav Oleshko
 */
public class Alarm implements Device {
    private SmartHouse smartHouse;

    public Alarm(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
        smartHouse.registerAlarm(this);
    }

    @Override
    public void doUsefulJob() {
        smartHouse.alarm();
    }

    public void alarm() {
        System.out.println("It's alarm! Wake up!");
    }
}

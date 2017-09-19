import java.util.Arrays;
import java.util.List;

/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        SmartHouse smartHouse = new SmartHouse();
        Device coffeeMachine = new CoffeeMachine(smartHouse);
        Device tv = new TV(smartHouse);
        Device alarm = new Alarm(smartHouse);
        List<Device> deviceList = Arrays.asList(coffeeMachine, tv, alarm);
        deviceList.forEach(Device::doUsefulJob);
    }
}

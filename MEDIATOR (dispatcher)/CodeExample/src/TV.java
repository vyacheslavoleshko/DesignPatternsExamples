/**
 * @author Viacheslav Oleshko
 */
public class TV implements Device {
    private SmartHouse smartHouse;

    public TV(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
        smartHouse.registerTV(this);
    }

    @Override
    public void doUsefulJob() {
        smartHouse.switchOnTv();
    }

    public void switchOn() {
        System.out.println("Switching on TV");
    }
}

/**
 * @author Viacheslav Oleshko
 */
public class CoffeeMachine implements Device {
    private SmartHouse smartHouse;

    public CoffeeMachine(SmartHouse smartHouse) {
        this.smartHouse = smartHouse;
        smartHouse.registerCoffeeMachine(this);
    }

    @Override
    public void doUsefulJob() {
        smartHouse.prepareCoffee();
    }

    public void prepareCoffee() {
        System.out.println("Preparing coffee");
    }
}

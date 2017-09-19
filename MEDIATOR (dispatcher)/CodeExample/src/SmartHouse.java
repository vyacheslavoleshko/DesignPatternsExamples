/**
 * Concrete mediator. It incapsulates logic of devices interactions
 *
 * @author Viacheslav Oleshko
 */
public class SmartHouse implements ISmartHouse {
    private TV tv;
    private Alarm alarm;
    private CoffeeMachine coffeeMachine;

    @Override
    public void registerAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void registerCoffeeMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void registerTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public void alarm() {
        System.out.println("-------- Smart house: alarm invoked! -------- ");
        alarm.alarm();
        coffeeMachine.prepareCoffee();
    }

    @Override
    public void switchOnTv() {
        System.out.println("-------- Smart house: switch on TV invoked! --------");
        tv.switchOn();
        coffeeMachine.prepareCoffee();
    }

    @Override
    public void prepareCoffee() {
        System.out.println("-------- Smart house: prepare coffee invoked! --------");
        coffeeMachine.prepareCoffee();
    }
}

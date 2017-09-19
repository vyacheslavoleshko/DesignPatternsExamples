/**
 * Mediator interface
 *
 * @author Viacheslav Oleshko
 */
public interface ISmartHouse {
    void alarm();
    void switchOnTv();
    void prepareCoffee();
    void registerAlarm(Alarm alarm);
    void registerCoffeeMachine(CoffeeMachine coffeeMachine);
    void registerTV(TV tv);
}

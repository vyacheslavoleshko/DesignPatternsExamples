import factories.AbstractFactory;
import hero_type.Hero;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Viacheslav Oleshko
 */
public class SquadCreator {
    public void createSquad(AbstractFactory factory) {
        List<Hero> squad = new ArrayList<>();
        squad.add(factory.createWizard());
        squad.add(factory.createArcher());
        squad.add(factory.createWarrior());
        squad.forEach(System.out::println);
        System.out.println("____________________");
    }
}

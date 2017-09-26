import factories.CheaterFactory;
import factories.ElfFactory;
import factories.GnomeFactory;

/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        SquadCreator squadCreator = new SquadCreator();
        squadCreator.createSquad(new ElfFactory());    // new squad with ElfArcher, ElfWarrior, ElfWizard will be created
        squadCreator.createSquad(new GnomeFactory());  // new squad with GnomeArcher, GnomeWarrior, GnomeWizard will be created
        squadCreator.createSquad(new CheaterFactory());  // new squad with ElfArcher, ElfWizard, GnomeWarrior will be created
    }
}

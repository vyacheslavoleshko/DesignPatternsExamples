package hero_race.gnome;

import hero_type.Warrior;

/**
 * @author Viacheslav Oleshko
 */
public class GnomeWarrior implements Warrior {
    @Override
    public void smash() {
        System.out.println("Attack with Gnome Axe");
    }
}

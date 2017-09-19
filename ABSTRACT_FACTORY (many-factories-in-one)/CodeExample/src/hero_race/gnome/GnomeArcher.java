package hero_race.gnome;

import hero_type.Archer;

/**
 * @author Viacheslav Oleshko
 */
public class GnomeArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Shoot from Gnome Bow");
    }
}

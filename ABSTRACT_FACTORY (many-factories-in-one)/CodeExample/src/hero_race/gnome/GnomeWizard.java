package hero_race.gnome;

import hero_type.Wizard;

/**
 * @author Viacheslav Oleshko
 */
public class GnomeWizard implements Wizard {
    @Override
    public void cast() {
        System.out.println("Casting using Gnome Magic");
    }
}

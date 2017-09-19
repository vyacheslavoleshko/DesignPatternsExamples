package systems;

/**
 * @author Viacheslav Oleshko
 */
public class Sluice {
    String sluiceNumber;

    public Sluice(String sluiceNumber) {
        this.sluiceNumber = sluiceNumber;
    }

    public void openSluice() {
        System.out.println(String.format("Sluice %s: opened", this.sluiceNumber));
    }
}

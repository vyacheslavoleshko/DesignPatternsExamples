/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        Archiver archiver = new Archiver();
        Strategy zipStrategy = new ZipStrategy();
        Strategy rarStrategy = new RarStrategy();

        archiver.setStrategy(zipStrategy);
        archiver.archive("C://1.txt");

        archiver.setStrategy(rarStrategy);
        archiver.archive("C://2.txt");
    }
}

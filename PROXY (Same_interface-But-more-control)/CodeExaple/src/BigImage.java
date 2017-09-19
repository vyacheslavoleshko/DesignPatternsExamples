/**
 * Image is really big and we do not want to load it until user will explicitly call display().
 *
 * @author Viacheslav Oleshko
 */
public class BigImage implements Image{

    public BigImage() {
        loadFromDisk();
    }

    public void display() {
        System.out.println("Displaying image...");
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk...");
    }
}

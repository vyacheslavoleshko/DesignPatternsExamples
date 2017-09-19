/**
 * @author Viacheslav Oleshko
 */
public class BigImageProxy implements Image {
    private BigImage bigImage = null;


    @Override
    public void display() {
        // Load picture ONLY WHEN IT IS NEEDED (when display() was called)
        if (bigImage == null) {
            bigImage = new BigImage();
        }
        bigImage.display();
    }
}

/**
 * @author Viacheslav Oleshko
 */
public abstract class SoftwareCoding {
    abstract void openFavouriteIDE();
    abstract void code();
    abstract void enjoy();

    // template method
    public final void createSoftware() {
        openFavouriteIDE();
        code();
        enjoy();
    }
}

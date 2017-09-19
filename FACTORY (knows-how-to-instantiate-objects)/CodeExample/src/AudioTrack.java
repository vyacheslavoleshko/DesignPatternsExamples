/**
 * @author Viacheslav Oleshko
 */
public class AudioTrack {
    private String extension;
    private String title;

    public AudioTrack(String title, String extension) {
        this.title = title;
        this.extension = extension;
    }

    public String getExtension() {
        return extension;
    }

    public String getTitle() {
        return this.title;
    }
}

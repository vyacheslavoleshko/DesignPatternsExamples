
/**
 * @author Viacheslav Oleshko
 */
public class Mp3Player implements AudioPlayer {
    @Override
    public void play(AudioTrack track) {
        System.out.println(String.format(
                "Playing Mp3: %s...", track.getTitle()));
    }
}

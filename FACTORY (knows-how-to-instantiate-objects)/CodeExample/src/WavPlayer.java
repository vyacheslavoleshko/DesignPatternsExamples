
/**
 * @author Viacheslav Oleshko
 */
public class WavPlayer implements AudioPlayer {
    @Override
    public void play(AudioTrack track) {
        System.out.println(String.format(
                "Playing Wav: %s...", track.getTitle()));
    }
}

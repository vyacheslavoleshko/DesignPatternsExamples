
/**
 * @author Viacheslav Oleshko
 */
public class AudioPlayerFactory {
    private AudioPlayerFactory() {}

    private static AudioPlayerFactory factory = null;

    public static AudioPlayerFactory getFactory() {
        if (factory == null) {
            factory = new AudioPlayerFactory();
        }
        return factory;
    }

    public AudioPlayer getPlayer(AudioTrack track) {
        switch (track.getExtension()) {
            case "wav":
                return new WavPlayer();
            case "mp3":
                return new Mp3Player();
            default:
                throw new IllegalArgumentException("Unknown audio file extension!");
        }
    }
}

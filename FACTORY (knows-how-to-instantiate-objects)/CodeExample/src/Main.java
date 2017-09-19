
/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        AudioPlayerFactory factory = AudioPlayerFactory.getFactory();
        AudioTrack wavTrack = new AudioTrack("Shadow Moses", "wav");

        AudioPlayer wavPlayer = factory.getPlayer(wavTrack);
        wavPlayer.play(wavTrack);

        AudioTrack mp3Track = new AudioTrack("Can you feel my heart", "mp3");
        AudioPlayer mp3Player = factory.getPlayer(mp3Track);
        mp3Player.play(mp3Track);
    }
}

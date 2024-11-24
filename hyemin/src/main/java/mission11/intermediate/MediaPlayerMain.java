package mission11.intermediate;

public class MediaPlayerMain {
    public static void main(String[] args) {
        Playable playable = new MediaPlayer();
        Pauseable pauseable = new MediaPlayer();

        playable.play();
        pauseable.pause();
    }
}

package mission11.intermediate;

public class MediaPlayerMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        ((Playable) mediaPlayer).play();
        ((Pauseable) mediaPlayer).pause();
    }
}

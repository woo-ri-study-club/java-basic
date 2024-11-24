package mission11.medium;

public class MediumMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        Playable playable = mediaPlayer;
        playable.play();

        Pauseable pauseable = mediaPlayer;
        pauseable.pause();

    }
}

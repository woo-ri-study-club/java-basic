package middle;

public class Main {
    public static void main(String[] args) {
        Playable playable = new MediaPlayer();
        playable.play();

        Pauseable pauseable = new MediaPlayer();
        pauseable.pause();
    }
}

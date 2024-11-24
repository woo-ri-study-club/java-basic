package mission2;

public class Main {
    public static void main(String[] args) {
        Playable play = new MediaPlayer();
        Pauseable pause = new MediaPlayer();

        play.play();
        pause.pause();
    }
}

package mission11.middle;

public class MiddleMain {
    public static void main(String[] args) {
        Playable play = new MediaPlayer();
        Pauseable pause = new MediaPlayer();

        play.play();
        pause.pause();
    }
}

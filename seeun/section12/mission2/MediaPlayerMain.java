package section12.mission2;

public class MediaPlayerMain {

    public static void main(String[] args) {
        Playable mediaPlayerForPlay = new MediaPlayer();
        Pauseable mediaPlayerForPause = new MediaPlayer();

        mediaPlayerForPlay.play();
        mediaPlayerForPause.pause();
    }
}

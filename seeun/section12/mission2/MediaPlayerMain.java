package section12.mission2;

import java.util.ArrayList;

public class MediaPlayerMain {

    public static void main(String[] args) {
        Playable mediaPlayerForPlay = new MediaPlayer();
        Pauseable mediaPlayerForPause = new MediaPlayer();

        mediaPlayerForPlay.play();
        mediaPlayerForPause.pause();

        ArrayList<Integer> arr = new ArrayList<>();
    }
}

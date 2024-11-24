package mission2;

public class MediaPlayer implements Playable, Pauseable {
    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        System.out.println("Paused.");
    }
}

package middle;

public class MediaPlayer implements Playable, Pauseable {
    @Override
    public void pause() {
        System.out.println("Paused.");
    }

    @Override
    public void play() {
        System.out.println("Playing...");
    }
}

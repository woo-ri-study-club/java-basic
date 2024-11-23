package mission11.middle;

public class MediaPlayer implements Playable, Pauseable{
    @Override
    public void play() {
        System.out.println("Playing...");
    }

    @Override
    public void pause() {
        System.out.println("Paused.");
    }
}

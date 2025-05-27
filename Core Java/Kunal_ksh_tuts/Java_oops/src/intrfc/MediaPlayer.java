package intrfc;

public class MediaPlayer implements Media{
    @Override
    public void play() {
        System.out.println(" media player is started ..");
    }

    @Override
    public void stop() {
        System.out.println(" media player is stopped.");
    }
}

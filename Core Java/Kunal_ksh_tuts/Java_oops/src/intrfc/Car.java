package intrfc;

public class Car implements Engine,Media{
    @Override
    public void start() {
        System.out.println(" engine start ");
    }

    @Override
    public void play() {
        System.out.println(" media player playing...");
    }

    @Override
    public void stop() {
        System.out.println(" engine stop ");
    }


}

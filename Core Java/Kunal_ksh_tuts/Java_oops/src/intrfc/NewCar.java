package intrfc;

public class NewCar {

    private Engine egn;
    private Media media;

    public NewCar() {
        egn = new PetrolEngine();
        media = new MediaPlayer();
    }

    public void startEngine()
    {
        egn.start();
    }

    public void startMedia()
    {
        media.play();
    }


    public void stopEngine()
    {
        egn.stop();
    }

    public void stoptMedia()
    {
        media.stop();
    }

}

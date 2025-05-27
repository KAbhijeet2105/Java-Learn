package inheritance;

public class Animal {
    int legs  = 4;

    public Animal()
    {

    }

    public Animal(int legs) {
        this.legs = legs;
    }

    public void eat()
    {
        System.out.println("animal eating ");
    }
}

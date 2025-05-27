package inheritance;

public class Dog extends Animal{

    String color = "white";

    public Dog() {

    }

    public Dog(String color) {

        this.color = color;
    }

    public Dog(int legs, String color) {
        super(legs);
        this.color = color;
    }

    public void bark()
    {
        System.out.println("Dog is barking!");
    }

}

package abstraction;

public class Audi extends Car{


    @Override
    void brand() {
        System.out.println("this is Audi");
    }

    @Override
    void price(float price) {
        System.out.println("the price is : "+price);
    }
}

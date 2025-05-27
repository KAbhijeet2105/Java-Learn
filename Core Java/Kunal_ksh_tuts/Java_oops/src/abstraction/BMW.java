package abstraction;

public class BMW extends Car{


    @Override
    void brand() {
        System.out.println("This is bmw");
    }

    @Override
    void price(float price) {
        System.out.println("the price is :"+price);
    }
}

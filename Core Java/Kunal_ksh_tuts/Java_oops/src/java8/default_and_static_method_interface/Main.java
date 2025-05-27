package java8.default_and_static_method_interface;

import static java8.default_and_static_method_interface.Car.engine;

public class Main {

    public static void main(String[] args) {

        MyCar bmw = new MyCar();

        bmw.brandName();
        engine();
        bmw.start();


    }

}

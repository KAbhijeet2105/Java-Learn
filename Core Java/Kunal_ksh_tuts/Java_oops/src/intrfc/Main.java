package intrfc;

public class Main {

    public static void main(String[] args) {

//        Car mycar = new Car();
//
//        mycar.start();
//        mycar.stop();
//        mycar.play();
//        mycar.stop();

        NewCar car = new NewCar();

        car.startEngine();
        car.stopEngine();
        car.startMedia();
        car.stoptMedia();

    }


}

/*
An interface in Java is a blueprint of a class. It has static constants and abstract methods.

  The interface in Java is a mechanism to achieve abstraction.
  There can be only abstract methods in the Java interface, not method body.
  It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables.
It cannot have a method body.

*/

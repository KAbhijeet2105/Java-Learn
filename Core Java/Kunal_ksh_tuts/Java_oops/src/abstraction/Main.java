package abstraction;

public class Main {

    public static void main(String[] args) {

        BMW bmw = new BMW();
        bmw.brand();
        bmw.price(6500000.00f);

        Audi audi  = new Audi();
        audi.brand();
        audi.price(6200000.00f);

    }

}

/*

Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details,
for example, sending SMS where you type the text and send the message.
You don't know the internal processing about the message delivery.




* An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
*
* */
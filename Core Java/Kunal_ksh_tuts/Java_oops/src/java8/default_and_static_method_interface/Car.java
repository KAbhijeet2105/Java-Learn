package java8.default_and_static_method_interface;

public interface Car {

     default void start()
    {
        System.out.println("Car start!");
    }

    static void engine()
    {
        System.out.println("I have 2900cc engine");
    }
    void brandName();

}

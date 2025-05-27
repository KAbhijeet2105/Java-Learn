package creationalPatterns.singletonExample;

public class SingletonDemo {
    public static void main(String[] args) {

        LoggerSingleton singletonObj1 = LoggerSingleton.getInstance();

        System.out.println(singletonObj1);

        LoggerSingleton singletonObj2 = LoggerSingleton.getInstance();

        System.out.println(singletonObj2);

    }
}
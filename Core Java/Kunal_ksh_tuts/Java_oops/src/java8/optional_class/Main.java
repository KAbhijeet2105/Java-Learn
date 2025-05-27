package java8.optional_class;


import java.util.Optional;

public class Main {

    public static void main(String[] args) {

       /* String[]str = new String[10];

        Optional<String> chkNull = Optional.ofNullable(str[5]);

        if(chkNull.isPresent())
        {
            String word = str[5].toLowerCase();
            System.out.println(str);
        }
        else
            System.out.println("string is null");
        */

        ////////////////////
        //example 2

        String a = null;

        Optional<String> chk = Optional.ofNullable(a);

        System.out.println(chk.orElse("its null"));




    }

}

/*
* In Java 8, the “java.util” package included an optional class.
* The public final class “Optional” is used to handle NullPointerException in a Java program.
* You may give other code or values to execute using Optional.
* Thus, optional reduces the number of null checks required to avoid a nullPointerException.

You may use the Optional class to prevent the application from crashing and terminating unexpectedly.
* The Optional class has methods for checking the existence of a value for a given variable.
*
* */
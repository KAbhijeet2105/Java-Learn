package string_stringbuilder;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder  = new StringBuilder(); //this is mutable

        for(int i = 0; i < 26; i++)
        {
            char ch = (char) ('a'+ i);
            builder.append(ch);
        }

       // System.out.println(builder);

        String name = "Abhijeet Kadam";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

          System.out.println( Arrays.toString(name.split("") ));



    }
}

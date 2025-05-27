package java8.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {

        //list filter even numbers

        List<Integer> lst  = new ArrayList<>();

        for (int i = 1; i < 10; i++)
        {
            lst.add(i);
        }

        List<Integer> even = new ArrayList<>();

        //without stream

       /* for(int i : lst)
        {
            if( i % 2 == 0 )
                even.add(i);
        }
     */

        //using stream API

       // Stream<Integer> stream = lst.stream();

        even = lst.stream().filter( (item)->(item % 2 == 0)).collect(Collectors.toList());

        System.out.println(even);




    }
}

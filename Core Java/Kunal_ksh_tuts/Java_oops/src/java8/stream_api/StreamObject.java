package java8.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        //Stream API - collection process


        //1 array, object, collection
        String names[] = {"abhi","jeet","mayu","purvi"};

        Stream<String> stream1 = Stream.of(names);

        stream1.forEach( itr -> {
            System.out.println(itr);
        });

        //2  builder pattern

        Stream<Object> streamBuilder = Stream.builder().build();

        // 3. array

       IntStream strm =  Arrays.stream(new int[]{2,4,65,3,412});
       System.out.println(strm.count());

        //4. IMP
        ///List , Set

        List<Integer> lst  = new ArrayList<>();

        for (int i = 1; i < 10; i++)
        {
            lst.add(i);
        }

        Stream<Integer> stream = lst.stream();

        System.out.println(stream.count());







    }

}

package java8.stream_api;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i < 10; i++)
        {
            nums.add(i);
        }


        //filter
        //boolean val
        //e-> e>10

        List<String> names = new ArrayList<>();
        names.add("Abhi");
        names.add("jeet");
        names.add("purvi");
        names.add("mayu");

        List<String> res = names.stream().filter( nm -> nm.startsWith("A") ).collect(Collectors.toList());
       // System.out.println(res);

        //map
        //each element operation ie. maps operation to each element


        List<Integer> ans = nums.stream().map(item -> item*item).collect(Collectors.toList());
        System.out.println(ans);



    }


}

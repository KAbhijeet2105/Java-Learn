
//["chennai","ahmedabad","delhi","bangalore"]

import java.util.*;

public class Main {

    public static void main(String[] args) {

      /*  ArrayList<String> arr = new ArrayList<>();

        arr.add("chennai");
        arr.add("ahmedabad");
        arr.add("delhi");
        arr.add("bangalore");


        Collections.sort(arr);

        System.out.println(arr);
*/

        Integer[] a={1,2,3};
        Integer[] b ={4,3,5};

        Set<Integer> st = new HashSet<>();

        for(int i  = 0; i < a.length; i++)
        {
            st.add(a[i]);
        }

        for(int i  = 0; i < b.length; i++)
        {
            if(st.contains(b[i]))
            {
                System.out.println(" "+b[i]+" ");
            }
        }


    }


}

//employee table
//
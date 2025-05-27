import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(6);
        arr.add(3);
        arr.add(85);
        arr.add(74);
        arr.add(174);

        //min max
      //  System.out.println(Collections.min(arr) );

        //frequency count

      //  System.out.println(Collections.frequency(arr,3));


        Collections.sort(arr);

        System.out.println(arr);

        //sorting in descending order

       // Collections.sort(arr, Comparator.reverseOrder());

      /*  List<Student> st = new ArrayList<>();

        st.add(new Student("Abhi",21));
        st.add(new Student("Mayu",5));
        st.add(new Student("Manasi",6));

        st.add(new Student("jeet",22));

        System.out.println(st);
        */


        //Collections.sort(st);




        //passing custom comparator

      /*  Collections.sort(st, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });


        System.out.println(st);
*/

    }

}

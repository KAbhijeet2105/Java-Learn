import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    //hashset , Linked Hashset ,treeset ,
    //duplicate elements not allowed

    public static void main(String[] args) {

        /////////////////////////////////////////////////////////

        /// 1 hashset3
        //dont maintain order
        // TC : O(1)
        //Set<Integer>  set = new HashSet<>(); //regular hashset

        ////////////////////////////////////////////////////////////
        // 2 Linked Hash set
        //
         //Set<Integer> set = new LinkedHashSet<>();

        //all methods are same as hashset
        //Linked Hashset #####** maintains Order ********#### elements will remain as it is when you put into set
        //doest maintain sorted order only the order you push elements
        //tc = O(1)

        /////////////////////////////////////////////////////////////////////////////

        // 3. Tree Set

        Set<Integer> set = new TreeSet<>();

        //all methods are same as hashset
        //TreeSet #####** maintains SORTED Order ********#### elements maintained in sorted form // uses bst
        //TC: O(log n )

/*
        set.add(32);
        set.add(12);
        set.add(45);
        set.add(13);
        set.add(24);

        System.out.println(set);

        set.remove(13);

        System.out.println(set);

        System.out.println(set.contains(32));
        System.out.println(set.contains(99));

        System.out.println(set.isEmpty());
        System.out.println(set.size());
*/
        //set.clear(); // to delete whole set

        ///////////////////////////////////////



    ///sets of custom class

    Set<Student> st = new HashSet<>();

        st.add(new Student("Abhi",21));
        st.add(new Student("Mayu",5));
        st.add(new Student("Manasi",6));

        st.add(new Student("jeet",21));

        System.out.println(st);


    }

}

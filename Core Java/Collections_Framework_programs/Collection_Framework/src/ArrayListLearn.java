import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearn {

    public static void main(String []args) {

        ArrayList<String> studentNames = new ArrayList<>();

        //add function: adds element at the end of list

        studentNames.add("Abhijeet");
        studentNames.add("Manasi");
        studentNames.add(1,"gayatri");


        ArrayList<String> tmp = new ArrayList<>();

        tmp.add("akash");
        tmp.add("Neha");




        studentNames.addAll(1,tmp); // to add new list

        System.out.println(studentNames);
        // for accessing element we use get funciton

       // System.out.println(studentNames.get(3));

            //for removing element we use remove funciton

       // studentNames.remove(1); //removes at index
        studentNames.remove(String.valueOf("akash")); //use className.valueOf(value) for removing the exact value

        ////for clearing/ deleting whole list we use list.clear() function

        //studentNames.clear();

        //if we want to set value of some index we use set function

        studentNames.set(2,"Purvi");

      //  System.out.println(studentNames);

        //for checking list contains given element or not we use contains() .//case sensitive

      //  System.out.println(studentNames.contains("neha"));

        //Iterating elements

         //1 normal for loop
/*
        for(int i = 0; i < studentNames.size(); i++)
        {
            System.out.println(studentNames.get(i));
        }
*/
    // 2 using for each loop
/*
        for( String itr : studentNames)
        {
            System.out.println(itr);
        }
*/
        //3 . using iterator

        Iterator<String> it = studentNames.iterator();

        while(it.hasNext())
        {
            System.out.println("itarator : " + it.next());
        }


    }
}

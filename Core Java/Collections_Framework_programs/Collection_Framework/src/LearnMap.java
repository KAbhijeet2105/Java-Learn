import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


//maps works like key,value pair
//no duplicate keys

public class LearnMap {


    public static void main(String[] args) {

        Map<String,Integer> mp = new HashMap<>();

        mp.put("One",1);
        mp.put("Two",2);
        mp.put("Three",3);
        mp.put("Four",4);
        mp.putIfAbsent("Two",23);


      //  System.out.println(mp);

        //iterating maps



          /*

          for(Map.Entry<String,Integer> e : mp.entrySet())
            {
                System.out.println(e);
                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }

            for(String key : mp.keySet())
            {
                System.out.println(key);
            }

            for (Integer val: mp.values())
            {
                System.out.println(val);
            }
            */

        //check if key is present
/*
        if (mp.containsKey("Four"))
            System.out.println("yes ");

        if(mp.containsValue(2))
            System.out.println("yes");
*/

        ////////////////////////////////////////////////////////////////////

        //TreeMap maintains elements in sorted form. it sorts on basis of String

        //all functions are same as Hashmap

        Map<String,Integer> nums = new TreeMap<>();

        nums.putAll(mp);

        System.out.println(nums);




    }


}

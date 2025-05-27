import java.util.Arrays;

public class LearnArraysClass {


    //Operations on Normal Array


    public static void main(String[] args) {

        int[] nums = { 1,2,3,4,5,6,7,8,9,10};

        int idx = Arrays.binarySearch(nums,6);

        System.out.println("index is : "+ idx);

        //for sorting the array

        Arrays.sort(nums);

        Arrays.fill(nums,15); //setting default value to whole array

        for(int itr : nums)
            System.out.print(itr+" ");

    }

}

import java.util.ArrayDeque;

public class LearnArrayDequeue {
    public static void main(String[] args) {

        ArrayDeque<Integer> arr = new ArrayDeque<>(); //queue functions and array dequeue functions

        arr.offer(23); // adds element at last

        arr.offerFirst(12); // add element at first

        arr.offerLast(45); // add element at last

        System.out.println(arr.peek());  // shows first element
        System.out.println(arr.peekFirst());//shows first element
        System.out.println(arr.peekLast()); //shows last element

        System.out.println(arr);

        arr.poll(); //deletes from front

        System.out.println(arr);

        arr.pollFirst();  //deletes from first

        System.out.println(arr);

        arr.pollLast();   //deletes from last or end

        System.out.println(arr);



    }
}

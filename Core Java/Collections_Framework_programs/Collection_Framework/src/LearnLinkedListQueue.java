import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args)
    {

        Queue<Integer> queue = new LinkedList<>();

        //insert in queue

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        //remove from front

        System.out.println(queue.poll());

        //get front element

        System.out.println(queue.peek());
        System.out.println(queue.size());



    }

}

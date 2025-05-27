import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {

       // PriorityQueue<Integer> pq = new PriorityQueue<>(); //default is min heap

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //max heap

        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        pq.offer(5);
        pq.offer(30);
        pq.offer(2);


        System.out.println(pq);

        System.out.println(pq.poll()); //top element

        System.out.println(pq);

        System.out.println(pq.peek()); //prints top element



    }

}

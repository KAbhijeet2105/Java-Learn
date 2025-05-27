import java.util.Stack;

public class LearnStack {

    //Last in first out..

    public static void main(String [] args)
    {
        Stack<String> animals  = new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("cat");
        animals.push("Dog");

       // System.out.println("stk : "+animals);

        //System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals.peek());
        System.out.println(animals.capacity());
        System.out.println(animals.size());

    }

}

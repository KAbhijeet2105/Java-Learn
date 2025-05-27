package java8.lambda_expression;

import java.util.ArrayList;

public class LambdaFunctions {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(); // {3 ,4,52,1}

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        //lambda function

        //arr.forEach( (itr) -> System.out.println(itr * 2) );





        Operations sum = (a, b) -> a + b;
        Operations sub = (a, b) -> a - b;
        Operations multi = (a, b) -> a * b;


        LambdaFunctions lm = new LambdaFunctions();
        int res = lm.operate(5,10, sum);


    }

    int operate(int a, int b, Operations op)
    {
        return  op.operations(a,b);
    }


}

interface Operations {
    int operations(int a, int b);
}
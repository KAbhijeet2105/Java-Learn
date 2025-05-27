

public class Test1  {

    //all collection frame work are under java.utils

    public static void main(String []args)
    {

        String s = "abhijeet";

        String s1 = new String("abhijeet");

        String s2 = new String("abhijeet");

        String s3 = "abhijeet";


        System.out.println(s == s3);


    }

}


/*
*
*
* // finding duplicate orders and their count
*
*
 SELECT OrderID, COUNT(OrderID)
FROM Orders
GROUP BY OrderID
HAVING COUNT(OrderID) > 1
*
*
* */
/*

       finding 2nd highst salary

    SELECT MAX(SALARY) FROM Employee WHERE SALARY < (SELECT MAX(SALARY) FROM Employee);

    */
package string_stringbuilder;

public class StrBuilderStrBuffer {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuffer sbf = new StringBuffer("Abhijeet");

        for(int i = 0; i< 1000000; i++)
        {
            sbf.append("abhijeet");
        }

        System.out.println("time taken by string buffer is : "+ (System.currentTimeMillis() - startTime) + "ms");


        startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("Abhijeet");

        for(int i = 0; i< 1000000; i++)
        {
            stringBuilder.append("abhijeet");
        }

        System.out.println("time taken by string builder is : "+ (System.currentTimeMillis() - startTime) + "ms");


    }

}

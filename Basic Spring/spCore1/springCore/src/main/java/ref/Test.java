package ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext context =  new ClassPathXmlApplicationContext("ref_config.xml");

        A temp = (A)context.getBean("aref");

        System.out.println(temp);


    }

}

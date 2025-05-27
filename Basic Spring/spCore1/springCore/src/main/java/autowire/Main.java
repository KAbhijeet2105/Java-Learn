package autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire_config.xml");


        Emp emp1 = context.getBean("emp1", Emp.class);

        System.out.println(emp1);

    }

}

package classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello ");

        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:config.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");


        System.out.println(student1);
        System.out.println(student2);

    }

}

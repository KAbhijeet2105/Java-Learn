package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle_config.xml");

//        Samosa s1 = (Samosa) context.getBean("samosa");
//
//        System.out.println(s1);
//
      context.registerShutdownHook();
//
//        System.out.println("##########################################################################################");
//
//        Pepsi p1 =  (Pepsi) context.getBean("p1");
//
//        System.out.println(p1);


        AnnotationExample ae = (AnnotationExample) context.getBean("ex1");

        System.out.println(ae);

    }

}

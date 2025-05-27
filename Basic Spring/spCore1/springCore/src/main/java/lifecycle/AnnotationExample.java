package lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationExample {

    private String subject;

    public AnnotationExample() {
    }

    public AnnotationExample(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "AnnotationExample{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @PostConstruct
    public void init()
    {
        System.out.println("init method  of annotation example ");
    }

    @PreDestroy
    public void  destroy()
    {
        System.out.println("destroy method of annotation example");
    }


}

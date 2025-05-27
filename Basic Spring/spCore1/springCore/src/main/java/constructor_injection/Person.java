package constructor_injection;


//constructor injection ...

public class Person {

    private String name;
    private int personid;

    private Certi crt;

    public Person() {
    }

    public Person(String name, int personid, Certi crt) {
        this.name = name;
        this.personid = personid;
        this.crt = crt;
    }

    public Person(String name, int personid) {
        this.name = name;
        this.personid = personid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid=" + personid +
                ", crt=" + crt +
                '}';
    }
}

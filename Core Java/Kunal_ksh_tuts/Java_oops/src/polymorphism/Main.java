package polymorphism;

public class Main {

    public static void main(String[] args) {

        Shapes sh;

         sh = new Circle();

         sh.area();

         sh = new Square();

         sh.area();


    }

}

/*
*  2 types of polymorphism
*  1>compile time polymorphism (Achived via method overloading) same name but args,return type can be different
*       eg. multiple constructors
*
* 2>run time polymorphism  (Achived via method overriding) same method signature as parent class just body is different
*
*
*
*
* */
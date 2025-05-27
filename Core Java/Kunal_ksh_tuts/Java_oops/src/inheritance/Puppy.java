package inheritance;

public class Puppy extends Dog {

    Puppy() {
    }

    public void puppyBrak() {
        System.out.println("puppy is barking. It have "+super.legs+" legs ");
    }

}

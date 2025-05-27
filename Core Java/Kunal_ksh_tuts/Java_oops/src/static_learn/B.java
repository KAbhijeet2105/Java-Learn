package static_learn;

import static static_learn.A.X;

 class B extends A  {

    public static void main(String[] args) {

        A a = new A();
        X = 20;
        a.printX();
        System.out.println(X);
    }

}

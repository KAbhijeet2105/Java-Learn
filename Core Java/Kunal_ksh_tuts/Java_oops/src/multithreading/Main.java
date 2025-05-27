package multithreading;

public class Main {

    public static void main(String[] args) {

       MyThread t1 = new MyThread();

       t1.run();
        //
       // Thread thread = new Thread(t1);

        //thread.start();

    MyThread2 t2 = new MyThread2();

    t2.start();


/*
        Runnable r1 = new Runnable() {
            @Override
            public void run() {

                for(int i = 1; i< 10; i++) {

                    System.out.println(" thread 2 is started ....." + i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }


            }
        };


        Thread t1 = new Thread(r1);
        t1.start();
*/

        ///using Lamba expression

      /*  Runnable r = ()->{

            for(int i = 0; i< 10; i++)
                System.out.println("this is lambda ");
        };

        Thread t1 = new Thread(r);
        t1.start();
*/

    }

}

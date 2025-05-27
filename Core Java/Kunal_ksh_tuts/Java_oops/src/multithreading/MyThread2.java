package multithreading;

public class MyThread2 extends Thread{


    public void run()
    {
        for(int i = 1; i< 10; i++) {

            System.out.println(" thread 2 is started ....." + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}

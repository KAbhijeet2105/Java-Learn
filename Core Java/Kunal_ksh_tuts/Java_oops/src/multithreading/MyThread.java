package multithreading;


public class MyThread implements Runnable{


    @Override
    public void run() {

        for(int i = 1; i< 10; i++) {
            System.out.println(" thread 1 is started ....." + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

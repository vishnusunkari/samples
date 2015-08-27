package vis.javaspecific.collection;

public class ThreadLocalExample {


    public static class MyRunnable implements Runnable {

        private ThreadLocal<String> threadLocal =
               new ThreadLocal<String>();

        @Override
        public void run() {
            threadLocal.set(Thread.currentThread().getName() );
    
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
    
            System.out.println(threadLocal.get());
        }
    }


    public static void main(String[] args) {
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        thread1.setName("Boy");
        Thread thread2 = new Thread(sharedRunnableInstance);
        thread2.setName("Girl");

        thread1.start();
        thread2.start();
    }

}
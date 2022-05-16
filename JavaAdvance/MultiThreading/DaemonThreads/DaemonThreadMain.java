package JavaAdvance.MultiThreading.DaemonThreads;

class SimpleThread implements Runnable{
     public void run() {
      if(Thread.currentThread().isDaemon())
          System.out.println(Thread.currentThread().getName()+"  is daemon thread");
      else
          System.out.println(Thread.currentThread().getName()+"  is user thread");
     }
}
 
public class DaemonThreadMain {
     public static void main(String[] args){
        SimpleThread st = new SimpleThread();
        Thread th1 = new Thread(st,"Thread 1");//creating threads
        Thread th2 = new Thread(st,"Thread 2");
        Thread th3 = new Thread(st,"Thread 3");

        th2.setDaemon(true);//now th2 is daemon thread

        th1.start();//starting all threads
        th2.start();
        th3.start();
      }
}
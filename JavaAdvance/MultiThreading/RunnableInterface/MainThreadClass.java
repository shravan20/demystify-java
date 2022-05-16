package JavaAdvance.MultiThreading.RunnableInterface;

public class MainThreadClass {

    public static void main(String[] args) {
        FirstThread ft= new FirstThread();
        Thread t=new Thread(ft);
        t.start();
    }

}

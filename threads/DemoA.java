package threads;
class Counter{
    static int counter;

    public static synchronized void increment(){
        counter++;
    }
}
public class DemoA {
    public static void main(String[] args) throws InterruptedException {
        
        /*
         * Lambda expression of Functional Interface/anon inner class implementation
         * Runnable is functional Interface
         * and with its constructor remain inner class
         */
        Runnable obj1=()-> {
            for(int i=0;i<10000;i++)   Counter.increment();
        };
        Runnable obj2=()->{
            for(int i=0;i<10000;i++)   Counter.increment();
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
        /*
         * Here join is for pausing main thread, 
         * till t1 and t2 get complete
         */
        t1.join();
        t2.join();

        System.out.println("Counter "+Counter.counter);

    }
}



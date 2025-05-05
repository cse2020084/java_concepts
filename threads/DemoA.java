package threads;
class Counter{
    static int counter;

    public static synchronized void increment(){
        counter++;
    }
}
public class DemoA {
    public static void main(String[] args) throws InterruptedException {
        

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

        t1.join();
        t2.join();

        System.out.println("Counter "+Counter.counter);

    }
}



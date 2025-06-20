package threads;

public class DemoB {
    private class Counter{
        int count;
        public synchronized void increment(){
            count++;
        }
    }
    public static void main(String[] args) throws InterruptedException{
        DemoB d=new DemoB();
        Counter c=d.new Counter();
        Runnable obj1= () -> {
            for(int i=1;i<=10000;i++) c.increment();
        };


        Runnable obj2=() -> {
            for(int i=1;i<=10000;i++) c.increment();
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        t1.start();     
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("count "+c.count);
    }
}

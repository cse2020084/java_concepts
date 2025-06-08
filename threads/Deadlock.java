package threads;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deadlock {
    public static void main(String[] args) throws InterruptedException{
        // two resources/objects that will be operated or locked by threads
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        Runnable r1=new Runnable(){
            public void run(){
                synchronized(l1){
                    System.out.println("thread 0 holding l 1");
                    synchronized(l2){
                        System.out.println("thread 0 holding l 2");
                        l2.add(1);
                    }
                    System.out.println(Thread.currentThread().getName()+" "+l1+" "+l2);
                }
            }
        };

        Runnable r2=new Runnable(){
            public void run(){
                synchronized(l2){
                    System.out.println("thread 1 holding l 2");
                    synchronized(l1){
                        System.out.println("thread 1 holding l 1");
                        l1.add(9);
                    }
                    System.out.println(Thread.currentThread().getName()+" "+l1+" "+l2);
                }
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();

        
    }
}

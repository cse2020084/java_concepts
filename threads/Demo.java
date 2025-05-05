package threads;
class A extends Thread{
    public void run(){
        for (int i=0; i<=5; i++) {
            System.out.println(i+ " "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e+" ");
            }
        }
    }
}
/*
 * here instead of extending with Thread class
 * I will choose to implement it with Runnable interface , (Thread itself implements it)
 * The reason is simple,
 * java doesnot allow multiple inheritance through class,
 * so its good to have practice with runnable too.
 * please have a look at override run() in Thread class.
 */
class B implements Runnable{
    public void run(){
        for (int i=0; i<=5; i++) {
            System.out.println(i+ " "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e+" ");
            }
        } 
    }
}




public class Demo {

    public static void main(String[] args) {
        A obj=new A();
        Runnable obj1=new B();
        Thread t1=new Thread(obj1);
        obj.start();
        t1.start();

        for (int index = 0; index <=5; index++) {
            System.out.println(index+ " "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e+" ");
            }
        }


        /*
         * Lets  work with Lambda function here too,
         * as we know that Runnable interface has only one abstract method i.e, Functional interface
         * It will be simple with lambda function and annonymous inner classes
        */

        // Runnable obj2=new Runnable(){
        //     public void run(){
        //         for (int i=0; i<=5; i++) {
        //             System.out.println(i+ " "+Thread.currentThread().getName());
        //             try{
        //                 Thread.sleep(2000);
        //             }catch(Exception e){
        //                 System.out.println(e+" ");
        //             }
        //         }
        //     }
        // };

        Runnable obj2 =()-> {
                for (int i=0; i<=5; i++) {
                    System.out.println(i+ " "+Thread.currentThread().getName());
                    try{
                        Thread.sleep(2000);
                    }catch(Exception e){
                        System.out.println(e+" ");
                    }
                }
        };
        Thread t2=new Thread(obj2);
        t2.start();
        
    }
}

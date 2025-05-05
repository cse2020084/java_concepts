package threads;
class A extends Thread{
    public void run(){
        for (int i=0; i<=10; i++) {
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
        obj.start();

        for (int index = 0; index <=10; index++) {
            System.out.println(index+ " "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(e+" ");
            }
        }
    }
}

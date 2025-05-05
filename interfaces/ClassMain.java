package interfaces;
interface Base{
    String version="1-1";
}
interface Computer extends Base{
    int a = 20;  // by default- public static final
    void code(); // by default- public abstract
}
class Desktop implements Computer{
    
    public void code(){
        System.out.println("Code in Desktop");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Code in Laptop "+Computer.a);
    }
}

class Macbook implements Computer{
    public void code(){
        System.out.println("Code in MacBook ");
    }
}
class Developer{

    public void devJob(Computer dev){
        dev.code();
        System.out.println("In the Developer class that will execute the code function ");
    }
}
public class ClassMain {


    public static void main(String[] args){
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Computer mac=new Macbook();
        Developer dev=new Developer();
        dev.devJob(mac);
        dev.devJob(desk);
        dev.devJob(lap);
        System.out.println(mac.version);

        /*
         * If you write:
            Desktop desk = new Desktop();
            //  This will cause an error below:
            desk = new Laptop(); // Incompatible types
            but with
            Computer dev = new Desktop();
            dev = new Laptop(); //  Totally fine

         */
       
        
    }
}

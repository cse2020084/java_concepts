package innerclasses;

public class ClassMain {

     public static void main(String[] args) {
        Car obj=new Car();
        // System.out.println("model "+obj.model);
        Car.Engine objInner=obj.new Engine();
        //
        //// model will only print if it is not private in outer class and 
        //// the inner class method ,where model is get  reassigned, is called like below.
        objInner.start();
        // System.out.println("model "+obj.model); 

        

        //
        //// static inner classes for builder
        // User.Builder us=new User.Builder();
        // User us=
        new User.Builder().setAge(10).setName("Ram").build();

        //
        ///static inner classes for utility
        int ans=Math.Calculation.Square(10);
        System.out.println("Square of a "+ans);
       
     }
}
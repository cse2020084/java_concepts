package interfaces.FunctionalInterface;
@FunctionalInterface
interface A {
    void show();
}


//returning method interface
@FunctionalInterface
interface B {
    int add(int i, int j); 
}

public class Demo {
    public static void main(String[] args) {
        // A obj=new A(){
        //     public void show(){
        //         System.out.println("In show");
        //     }
        // };

        
        A obj= () -> System.out.println("In show ");
        // only use braces if l o c are more than 1;

        obj.show();


        B obj1 = (i,j)-> i+j;
        int result=obj1.add(8,9);
        System.out.println(result);
    }
}

import inheritance.*;
import encapsulation.*;

class ProtectedChecker extends Human{
    String subtitle=title;

    public void printProtectedField(){
        System.out.println("Printing field from An extended class out of package: "+subtitle);
    }
}

public class Demo {
    
    public static void main(String[] args) {
        SubCalculator scal=new SubCalculator(); 
        ClassA ca=new ClassA();
        ca.objectLoader();
        // ProtectedChecker pc=new ProtectedChecker();
        // pc.printProtectedField();

        
    }
}

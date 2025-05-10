package inheritance;

public class ClassMain {


    public static void main(String[] args) {
        // Calculator  cal=new Calculator();
        SubCalculator scal=new SubCalculator(3,1);
        scal.add(20,2);
        scal.add();
        scal.sub(); 
    }

}

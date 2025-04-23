package inheritance;

public class SubCalculator extends Calculator{
    SubCalculator(){
        System.out.println("In subcalculator default constructor");
    }

    SubCalculator(int a,int b){
        
        super(a,b);
        System.out.println("In subcalculator parameterized constructor"+this);

        // don’t duplicate fields in the child if the parent already has them.
    }
    private int a;
    private int b;

    public void  sub(){
        System.out.println("Sub :"+(getA()-getB()));
    }





}

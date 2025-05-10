package inheritance;

public class Calculator {
    Calculator(){
        System.out.println("IN Calculator default constructor "+this);
    }
    Calculator(int a, int b){
        this();
        this.setA(a);
        this.setB(b);
        System.out.println("IN calculator parametrixed constructor "+this);
    }

    private int a;
    private int b;
    
    public void add(int x,int y){
        System.out.println("addition : "+ (x+y));
    }

    public void add(){
        System.out.println("addition : "+(getA()+getB()));
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    public void setA(int a){  
          
        this.a=a;
        System.out.println("In set A "+this.a);  
    }

    public void setB(int b){
        this.b=b;
        System.out.println("In set B "+this.b); 
    }


}

package exceptions;

import java.util.Scanner;

// I dont want any odd number , so if I get any odd number what I will do, is I will throw a custom exception
class MyOddException extends Exception
{
    MyOddException(String string){
        super(string);
    }
}  
class A {
    int i;
    int j;
    int ans=0;
    A(int i,int j){
        this.i=i;
        this.j=j;
    }



    public void checkingAns() {
        try{
            ans=i/j;
            if(ans%2!=0){
                throw new MyOddException("I don't want any odd number as result");
            }else{
                System.out.println("Answer "+ans);
            }
        }catch(MyOddException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println("Error "+e);
        }catch(Exception e){
            System.out.println("Exception "+e);
        }
    }


    public void methodContainingException(int i) throws MyOddException{

        if((i&1)==1) throw new MyOddException("Wrong Input..");
        else System.out.println("Correct Input  "+i);
    }


    public void callingMethodForThrowsCheck(int i) {
        try {
            methodContainingException(i);           
        } catch (MyOddException e) {
            System.out.println(e);
        }finally{
            System.out.println("It will execute, no matter what");
        }


        
    }

    

}

public class ClassMain {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         A obj=new A(a,b);  
        //  obj.checkingAns();   
         obj.callingMethodForThrowsCheck(a);
         sc.close();  
    }
    

}

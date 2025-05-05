package inputs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number ");
        // System.in.read();
        ///
        // System.in.read is only going to give ascii int value,
        // which is of no use if you don't want any complexity
        // thats why java provide better alternative
        // for here, we are going to use of BufferedReader Classes
        // which are traditional way of taking input
        BufferedReader bf=null;
        try{
            InputStreamReader reader=new InputStreamReader(System.in);
            bf=new BufferedReader(reader);
            int num=Integer.parseInt(bf.readLine());
            System.out.println(num);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            bf.close();
        }

        
        

        // there is another more common ways nowadays, 
        // using Scanner Class, lets see that too,

        Scanner sc=new Scanner(System.in);
        String[] numInFormOfStringCharacter=sc.nextLine().split("\\s");
        int [] numArray=new int[numInFormOfStringCharacter.length-1];
        for(int i=0;i<numArray.length;i++){
            numArray[i]=Integer.parseInt(numInFormOfStringCharacter[i]);
            System.out.print(numArray[i]+" ");
        }

        System.out.println("Array is size of "+numInFormOfStringCharacter[numInFormOfStringCharacter.length-1]);
        sc.close();



        InputStreamReader reader2=new InputStreamReader(System.in);
        BufferedReader bf2=new BufferedReader(reader2);
        String token[]=bf2.readLine().split("\\s+");
        int[] number=new int[token.length-1];
        for(int i=0;i<number.length;i++){
            try{
                number[i]=Integer.parseInt(token[i]);
            }catch(Exception e){
                number[i]=-1;        
            }
            System.out.print(number[i]+" ");
        }
        bf2.close();
        // System.out.println();


    }
}

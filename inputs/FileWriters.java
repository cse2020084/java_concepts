package inputs;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) {
        // try{
        //     FileWriter writer =new FileWriter("inputs/example.txt",true);
        //     // writer.write("mmmmmmmmmmmmm");
        //     // System.out.println("success");
        //     writer.close();
        // }catch(IOException e){
        //     System.out.println(e);
        // }


        try{
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("inputs/example.txt",true));
            bufferedWriter.write("w");
            bufferedWriter.newLine();
            bufferedWriter.write("e");
            bufferedWriter.close();
        }catch(IOException e){
            System.out.println(e);
        }
        

    }
}

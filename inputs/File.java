package inputs;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        
        try{
            FileReader reader=new FileReader("inputs/example.txt");
            int i;
            while((i=reader.read())!=-1){
                // System.out.print((char) i);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Exception is is "+e.getMessage());
        }


        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("inputs/example.txt"));
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch(IOException e){
            System.out.println(e);
        }
        


    }
}

package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {

        //remove try-catch to see checked exceptions..
        //exception will be - File not found exception..
        try {
            FileReader file = new FileReader("abc.txt"); // file might not exist
            int i;
            while((i = file.read()) != -1) {
                System.out.print((char)i);
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Caught the exception: " + e);
        }
    }
}


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCP {
    public static void main(String[] args) {
        try {

            FileInputStream reader = new FileInputStream("origin");
            FileOutputStream writer = new FileOutputStream("copyOrigin");
            int i;
            while (( i = reader.read()) != -1){
                System.out.println((char)i);
                writer.write((char)i);
            }
            writer.close();
            FileInputStream newReader = new FileInputStream("copyOrigin");
            int j;
            while (( j = newReader.read()) != -1){
                System.out.println((char)j);   
            }




        } catch (IOException e) {
            // TODO: handle 
            System.out.println("Error occured ");
        }
    }
}

class InnerFileCP {
    

}
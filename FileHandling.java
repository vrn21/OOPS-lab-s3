import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

/**
 * FileHandling
 */
public class FileHandling {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char[] output = new char[100];
        try {
            Reader hi = new FileReader("hello.txt");
            hi.read(output);
            System.out.println("THe file contains the followng data");
            System.out.println(output);
            System.out.println("Input what to write");
            String writeData = sc.nextLine();
            FileWriter writer = new FileWriter("hello.txt");
            writer.append(writeData);
            writer.close();
            System.out.println("the file is currently ");
            Reader hinew = new FileReader("hello.txt");
            char[] newoutput = new char[100];
            hinew.read(newoutput);
            System.out.println(newoutput);


            hi.close();
        } catch (IOException o) {
            System.out.println("Sorry file not found");
        }

    }
}


class InnerFileHandling {
    
}
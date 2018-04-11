import java.io.*;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String [] args)throws FileNotFoundException,UnsupportedEncodingException{

            File file = new File("DataFile.txt");

            //Read file
            Scanner scan = new Scanner(file);
            scan.useDelimiter(",");
            while(scan.hasNext()){
                System.out.println(scan.next());
            }

            //Write file
            PrintWriter writer = new PrintWriter("WriteFile.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();




    }


}

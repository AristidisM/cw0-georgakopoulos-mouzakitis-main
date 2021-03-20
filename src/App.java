import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter filename to open!");
        String filename = input.next();
        try
        {
            Scanner inFile = new Scanner(new File(filename));

            while (inFile.hasNext())
            {
                String word = inFile.next();

                System.out.println(word);
            }

            inFile.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

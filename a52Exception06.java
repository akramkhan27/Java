import java.io.FileReader;
import java.io.FileNotFoundException;
// throw keyword

// The throw keyword is used to explicitly throw an exception from a specific point in the code.
// It is often used to create custom error messages or control the flow when a specific condition is met.
// With throw, you create an instance of an exception and throw it.
public class a52Exception06 {
    public static void main(String[] args) throws FileNotFoundException{
        try{
            FileReader filereader = new FileReader("akram.txt");
        }
        catch(Exception e){
            System.out.println("FILE NOT FOUND");
            throw new FileNotFoundException(); // forcefully adding exception 
            // System.out.println(e);
        }
        System.out.println("Hello");
    }
}

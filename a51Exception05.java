import java.io.FileReader;
import java.io.FileNotFoundException;

// throws keyword

// The throws keyword is used in a method signature to declare that a method can throw an exception.
// It notifies the caller of the method that they must handle or further declare the exception.
// throws is used when a method might throw a checked exception that needs to be handled.
public class a51Exception05 {
    // public static void main(String[] args) throws FileNotFoundException {
    //     FileReader filereader=new FileReader("akram.txt");
    //     System.out.println("Hello");
        
    //     // If we add throws to the main() method signature, we are declaring 
    //     // that the main method might throw specific exceptions, meaning we are 
    //     // shifting the responsibility to handle those exceptions up to the 
    //     // JVM (Java Virtual Machine). This way, any exceptions thrown within 
    //     // main that match the declared types will be caught by the JVM, which 
    //     // will then print the exception details, including a stack trace, to the console.

    //     // In production code, it's usually better to handle exceptions properly 
    //     // in main() to ensure a controlled program exit and potentially recover 
    //     // from errors gracefully, rather than relying on the JVM’s error messages.
    // }

    public static void main(String[] args) {
        try{
            method1();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("Hello");
    }
    public static void method1() throws FileNotFoundException{
        method2();
    }
    public static void method2() throws FileNotFoundException{
        FileReader filereader=new FileReader("temp.txt");
    }
}

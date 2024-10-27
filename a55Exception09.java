// try-with-resources

// The try-with-resources statement in Java is a special form of the 
// try statement that is used to manage resources like files, network connections, 
// and database connections. It ensures that each resource is closed automatically 
// after the program is finished with it, making the code cleaner and preventing 
// resource leaks. For this to work, the resource must implement the AutoCloseable 
// interface (such as BufferedReader, FileWriter, etc.).


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a55Exception09 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("a53example.txt"))) {
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }

        // try Block with Resource Initialization:
        // The BufferedReader is initialized within the try statement. Since BufferedReader 
        // implements AutoCloseable, it will automatically close when the try block is exited.

        // Automatic Resource Management:
        // There’s no need to manually close the BufferedReader in a finally block. After 
        // the try block finishes, the BufferedReader is closed automatically.

        // Error Handling:
        // The catch block handles any IOException that occurs while reading the file.
    }
}


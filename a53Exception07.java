// finally keyword

// The finally block in Java is a special block that is used with 
// try-catch statements. The code inside the finally block always 
// executes, regardless of whether an exception is thrown or not, 
// and even if there is a return statement in the try or catch 
// blocks. It is typically used for cleanup activities, such as 
// closing files, releasing resources, or cleaning up memory.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class a53Exception07 {
    public static void main(String[] args) {

        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader("a53example.txt"));
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        } finally {
            // Close the BufferedReader
            System.out.println("Hello");
            System.out.println(reader);
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("BufferedReader closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Failed to close BufferedReader: " + e.getMessage());
            }
        }

    }
}


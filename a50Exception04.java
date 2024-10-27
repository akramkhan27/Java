import java.io.FileReader;
import java.io.IOException;

// checked and unchecked exception

// Checked exceptions are exceptions that the Java compiler forces you to handle. 
// If a method has code that could throw a checked exception, it must either handle 
// the exception using a try-catch block or declare it in the method signature using 
// the throws keyword. If not handled or declared, the code will not compile.
// Examples of Checked Exceptions:

// IOException
// SQLException
// FileNotFoundException

// Unchecked exceptions, also known as runtime exceptions, are not checked 
// at compile time. They occur during the execution of the program and are 
// usually the result of programming errors, such as logical mistakes, 
// invalid inputs, or resource issues.
// Examples of Unchecked Exceptions:

// ArithmeticException (e.g., division by zero)
// NullPointerException
// ArrayIndexOutOfBoundsException


public class a50Exception04 {
    public static void main(String[] args) {
        // Checked Exception
        try{
            FileReader fileReader=new FileReader("akram.txt"); // FileNotFoundException may occur here
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

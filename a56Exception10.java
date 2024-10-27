// custom exception class

// In Java, a custom exception is a user-defined exception that allows 
// us to create specific error conditions tailored to our application. 
// Custom exceptions can help make code more readable and allow us to 
// handle situations that Java’s standard exceptions may not cover well. 
// Custom exceptions are created by extending the Exception class (for checked exceptions) 
// or RuntimeException class (for unchecked exceptions).

// Steps to Create a Custom Exception
// Extend the Exception class (for checked exceptions) or RuntimeException (for unchecked exceptions).
// Add a constructor that takes a custom message or other parameters.
// Throw the custom exception in your code where needed.

// Example of a Custom Checked Exception

// Step 1: Create the custom exception class
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message); // Passes the message to the Exception class constructor
    }
}

public class a56Exception10 {
    public static void main(String[] args) {
        try{
            checkAge(-10);  // This will throw InvalidAgeException
        }
        catch(InvalidAgeException e){
            System.out.println(e);
        }
    }
    // Step 2: Use the custom exception in a method
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<0){
            throw new InvalidAgeException("Invalid Age Input: age should be -> age>=0");
        }
        else{
            System.out.println("Age is Valid");
        }
    }
}

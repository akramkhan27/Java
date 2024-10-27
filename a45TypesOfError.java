// Syntax Errors:
// Syntax errors occur when you don’t follow the correct syntax (rules) of the Java language. 
// They are caught by the compiler before the code runs. Common syntax errors include 
// missing semicolons, incorrect braces, or misspelled keywords.

// Logical Errors:
// Logical errors don’t throw an error, but they cause incorrect output. 
// These errors occur because of incorrect logic in the code. The compiler
// won’t detect logical errors, so it’s up to the developer to debug them.

// Runtime Errors:
// Runtime errors happen while the program is running. Unlike syntax errors, these 
// are not detected by the compiler.
public class a45TypesOfError {
    public static void main(String[] args) {
        // Syntax Error
        // System.out.println("Hello World") // Missing Semicolon cause a syntax error

        // Logical Error
        int a=10;
        int b=20;
        // System.out.println("Sum is : "+(a-b)); // Logic error (should be (a+b))

        // Runtime Error
        // A common runtime error is NullPointerException, which occurs when the code tries 
        // to access an object or variable that hasn't been initialized.
        
        String name=null;
        System.out.println(name.toLowerCase());

    }
}

import java.util.Locale;

public class a6Print {
    public static void main(String[] args) {
        // System is a class where System related utilities methods(this methods interact
        // with runtime enviroment i.e environment provided by JRE) present in that class.
        // if we want to interact with environment we have to use System class method

        // out is static member in System which is connected to console
        // System.out.println(3);
        // System.out.println('A');
        // System.out.println();
        // System.out.println("Akram");

        // System.out.print(3);
        // System.out.print('A');
        // System.out.print("Akram");

        // System.out.printf("Akram");

        int a=10;
        int b=5;
        String name="Akram";
        String sum="Sum";

        // System.out.println(a,b); error because it takes only one argument
        // System.out.println(a+b);
        // System.out.println("Hello"+" "+"World");
        // System.out.println(a + b + name);
        // System.out.println(name + a + b);
        // System.out.println(name + " "+ (a+b));

        // System.out.println("Sum of "+a+" + "+b+" : "+(a+b));
        // System.out.print("Sum of "+a+" + "+b+" : "+(a+b));
        // System.out.printf("Sum of "+a+" + "+b+" : "+(a+b));
        // System.out.printf("Hello");

        // System.out.println("Sum of "+a+" + "+b+" : "+(a+b));
        // System.out.print("Sum of "+a+" + "+b+" : "+(a+b)+"\n");
        // System.out.printf("Sum of "+a+" + "+b+" : "+(a+b)+"\n");
        // System.out.printf("Hello");
        
        // System.out.printf("Sum of "+a+" + "+b+" : "+(a+b)+"\n");
        // System.out.println();
        // System.out.printf("%s of %d + %d : %d \n", sum, a, b, (a+b)); // % here is known as format specifier
        // %s -> String
        // %d -> Integer
        // %f -> Float
        // %c -> Character
        // %b -> Boolean
        // %e -> exponential

        float c=1.2f;
        char d='A';
        boolean isTrue=true;

        // System.out.printf("%f %c %b \n", c, d, isTrue);
        // System.out.printf("%.2f %c %b \n", c, d, isTrue);
        // System.out.printf("%e %c %b \n", c, d, isTrue);

        float number=32424422.32f;

        System.out.printf("Default Locale : %.2f \n", number);

        System.out.printf(Locale.US, "US Locale : %.2f \n",number);

        System.out.printf(Locale.FRANCE, "France Locale : %.2f \n",number);

        System.out.printf(Locale.GERMANY, "Germany Locale : %,.2f \n",number);


    }
}

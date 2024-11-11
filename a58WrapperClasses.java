import java.util.ArrayList;

// Wrapper classes in Java are used to wrap primitive data types 
// (like int, double, etc.) into objects so that they can be used 
// in scenarios where objects are required (e.g., in collections, generics). 
// Java provides a wrapper class for each primitive type.

// Wrapper classes convert Java's primitive types into objects. They’re essential 
// for using primitives with Java’s object-oriented features, such as in collections. 
// Here are Java's eight primitive types and their corresponding wrapper classes:

// Primitive Type	Wrapper Class
// byte	            Byte
// short	        Short
// int	            Integer
// long	            Long
// float	        Float
// double	        Double
// char	            Character
// boolean	        Boolean

public class a58WrapperClasses {
    public static void main(String[] args){
        // Autoboxing is the automatic conversion by Java of a 
        // primitive type into its corresponding wrapper class. 
        // This happens automatically, for example, when assigning 
        // a primitive value to a wrapper class variable or adding 
        // primitives to collections that require objects.

        int num=10;
        // Autoboxing : Converting int to Integer Automatically;
        Integer numWrapper=num;
        System.out.println(num);

        ArrayList<Integer> number= new ArrayList<>();
        number.add(num); // autoboxes int 10 to Integer
        System.out.println(number);
        
        // Unboxing is the opposite of autoboxing, where a wrapper class object 
        // is automatically converted back into its primitive type. This happens
        //  when an operation expects a primitive but receives a wrapper class object.

        Integer myNumber=2000; // Unboxing: converting Integer to int automatically
        int newNum=myNumber;
        System.out.println("Unboxed Int : "+newNum);

        // Each wrapper class comes with useful methods for converting between types, 
        // parsing, and comparing values. Here are some commonly used methods:

        // parseInt(), parseDouble(), etc. – Convert a String to a primitive.
        // valueOf() – Convert a String to a wrapper object.
        // intValue(), doubleValue(), etc. – Convert a wrapper object to a primitive.
        // compareTo() – Compare two wrapper objects.
        // toString() – Convert a wrapper object to a String.

        // Using parseInt() to convert String to int
        int num01= Integer.parseInt("123");
        System.out.println("Parsed int : "+num01);

        double num02= Double.parseDouble("32.35");
        System.out.println("Parsed double :"+num02);

        // Using valueOf() to create a wrapper object
        Integer num03= Integer.valueOf("900");
        System.out.println("Integer Object by valueOf() : "+num03);

        Double num04= Double.valueOf("900.100");
        System.out.println("Double Object by valueOf() : "+num04);

        // Using intValue() to get primitive int from Integer object
        int num05=num03.intValue();
        System.out.println("From Integer to int : "+num05);
        
        // Using doubleValue() to get primitive double from Double object
        double num06= num04.doubleValue();
        System.out.println("From Double to double : "+num06);

        // Using compareTo() to compare Integer objects
        Integer n1=10;
        Integer n2=10;
        System.out.println(n1.compareTo(n2));

        // Using toString() to convert Integer to String
        String n3=n1.toString();
        System.out.println(n3);

        // Summary:
        // Wrapper Classes: Convert primitives to objects.
        // Autoboxing: Automatically converts primitives to wrapper objects.
        // Unboxing: Automatically converts wrapper objects to primitives.
        // Common Methods: parseInt(), valueOf(), intValue(), compareTo(), and 
        // toString() help in converting, comparing, and manipulating data.

    }
}


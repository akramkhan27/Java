package school;

public class School {
////    public -> outside the package
////    public String name;
////    public int age;
//
//    // private -> inside the class itself
//    private String name;
//    private int age;
////    public School(){
////
////    }
//    public void sayHello(){
//        System.out.println("Hello");
//    }
//    // private constructor
//    private School(){
//
//    }
//    public static void sayBye(){
//        System.out.println("Say Bye");
//    }

    // example of, if we want only 1 object should be created not more than one
    // singleton pattern ->
//    To ensure only one instance of a class is created, which can be useful when managing
//    resources like database connections, file systems, or logging services.
//    It provides a global point of access to the single instance, so all parts
//    of the program share the same instance.
    // Static variable to hold the single instance of the class
    private static School instance;
    // Private constructor prevents instantiation from other classes
    private School(){};
    // Public method to provide access to the single instance
    public static School getInstance(){
        if(instance==null){
            instance= new School(); // Create instance if it doesn't exist
        }
        return instance; // Return the same instance every time
    }
    public void showMessage(){
        System.out.println("Hello, Akram");
    }

    // class can have modifier only public and no modifier which is default

}

// static keyword
// It can be applied on variables, methods, blocks, nested-classes.
// The main concepts behind static keyword is that it belongs to class rather than
// instances of the class.
// Static method cannot use non-static data members or call non-static
// methods directly.
// This and super cannot be used in static context.
// A static block is a block of code inside a class that is executed once when the class is loaded into memory, 
// before any objects are created and before the main method runs. 
// It’s often used for initializing static fields or for running code that needs to execute only once.

class Student{
    private int id;
    private String name;
    private int age;
    public static String connections;

    public static int count =0;
    // public  int count =0;
    public Student(){
        count++;
    }    
    public static void getCount(){
        System.out.println("The Number of Students is : "+count); // static count
        // System.out.println("The Number of Students is : "+count); // non static count -> error
    }
    static{
        connections="Databse connected";
        System.out.println(connections);
    }
}
public class a33AccessModifier01 {
    public static void main(String[] args){
        // Student s1=new Student();
        // Student s2=new Student();
        // Student s3=new Student();
        // Student s4=new Student();
        // Student s5=new Student();
        // // System.out.println(Student.count);
        // // System.out.println(s5.count);
        Student.getCount();




    }
}

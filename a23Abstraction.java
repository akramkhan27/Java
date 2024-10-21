class Student{
    private String name;
    private int rollNo;
    private int age;
    // in java, default constructor called if no constructor present in class 
    // and initialize the default value of instance variables

    // default constructor and paramaterized constructor
    // default constructor override
    // public Student(){
    //     String name="None";
    //     rollNo=0;
    //     age=0;
    // }

    // paramaterized constructor
    // when parameterized constructor is there then JVM does not include default constructor
    public Student(String name, int rollNo, int age){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
    }
    // constructor overloading
    public Student(String name){
        this.name=name;
    }

    public Student(int rollNo, int age){
        this.rollNo=rollNo;
    }
    public Student(int age){
        this.age=age;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
public class a23Abstraction {
    public static void main(String[] args){
        // Student s1=new Student();
        // System.out.println(s1.getName());
        // System.out.println(s1.getAge());
        // System.out.println(s1.getRollNo());

        // Student s2=new Student(); // error because default constructor is present then no default constructor called by JVM

        // Student s3=new Student("Akram", 50, 23);
        // System.out.println(s3.getName());
        // System.out.println(s3.getRollNo());
        // System.out.println(s3.getAge());
        
        Student s4=new Student("Marka");
        System.out.println(s4.getName());
        System.out.println(s4.getRollNo());
        System.out.println(s4.getAge());


    }
}

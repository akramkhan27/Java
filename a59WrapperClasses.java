class Student{
    int id;
}
public class a59WrapperClasses {
    // public static void main(String[] args) {
    //     Student student =new Student();
    //     student.id=1;
    //     fun(student);
    //     System.out.println(student.id);
    // }
    // public static void fun(Student a){
    //     // Student myStudent=new Student();
    //     // myStudent.id=2;
    //     // a=myStudent;

    //     a.id=2;
    // }

    // public static void main(String[] args) {
    //     Integer a=1;
    //     fun(a);
    //     System.out.println(a); // a not change because it is still referring to  1 

    // }
    // public static void fun(Integer b){
    //     b=2; // b change the object referring to 2
    // }

    public static void main(String[] args) {
        Integer a=1;
        Integer b=1;

        int x=3;
        int y=3;
        System.out.println(a==b);
        System.out.println(x==y); // == works in java with wrapper class
        System.out.println(a.equals(b));

    }
}

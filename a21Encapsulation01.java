class Student{
    // In class we have
    // properties/ fields/ instance variables and Properties/ methods
    // In Encapsulation fields should be private
    // And fields only accessable through public methods or
    // getters and setters but we cannot direclty accessable of fields of objects 

    // String name;
    // int rollNo;
    // int age;

    private String name;
    private int rollNo;
    private int age;

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
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<0){
            System.out.println("Invaid Input");
        }
        else{
            this.age=age;
        }
    }


}
public class a21Encapsulation01{
    public static void main(String[] args){
        Student s1=new Student();

        // s1.name="Akram";
        // s1.rollNo=50;
        // s1.age=15;
        // System.out.println(s1.name);
        // System.out.println(s1.rollNo);
        // System.out.println(s1.age);

        // s1.setAge(-20);
        s1.setAge(20);
        System.out.println(s1.getAge());
    }
}
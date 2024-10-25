package testSchool;
import school.School;

public class Test {
    public static void main(String[] args){
        // public
//        School s1=new School();
//        s1.name="Akram";
//        s1.age=23;
//        System.out.println(s1.name);
//        System.out.println(s1.age);

        // private
//        School s2=new School();
//        s2.name="Akram";        // error due to private fields
//        s2.age=23;

//        School s3=new School(); // error due to private constructor

        // private constructor and static
//        School.sayBye();

        // Singleton pattern
        School sc1= School.getInstance();
        sc1.showMessage();
        // Get another reference to the School instance
        School sc2= School.getInstance();
        sc2.showMessage();
        // Verify that both references point to the same instance
        System.out.println(sc1==sc2);
    }
}

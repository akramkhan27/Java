// Enum with Fields, Methods, and Constructors
// Enums can also have fields, constructors, and methods. 
// Here’s an example where we define an enum with additional properties:

enum Day{
    MONDAY("Monday","Somwar"),
    TUESDAY("Tuesday","Somwar"),
    WEDNESDAY("Wednesday","Somwar"), 
    THURSDAY("Thursday","Somwar"), 
    FRIDAY("Friday","Somwar"), 
    SATURDAY("Saturday","Somwar"),
    SUNDAY("Sunday","Somwar");

    private String lower;
    private String hindi;
    public String getHindi() {
        return hindi;
    }

    public String getLower() {
        return lower;
    }

    private Day(String lower, String hindi){
        this.lower=lower;
        this.hindi=hindi;
        System.out.println("Constructor called : "+this.lower+" and "+this.hindi);
       
    }
    
    public void display(){
        System.out.println("Today is : "+this.name());
    }
}
public class a63Enum03 {
    public static void main(String[] args) {
        Day monday=Day.MONDAY;
        monday.display();
        System.out.println(monday.getLower());
        System.out.println(monday.getHindi());
    }
}

// Enum
// An enum (short for "enumeration") in Java is a special data type that enables 
// a variable to hold a set of predefined constants. Enums are useful when you want 
// to work with a fixed set of known values, like days of the week, months of the 
// year, or specific states of an object.

// By default, each enum constant is public, static, and final.

// Enum Methods
// values() - Returns an array of all enum constants.
// ordinal() - Returns the position of the enum constant (starting from 0).
// valueOf() - Converts a string to an enum constant if it matches one of the enum names.


// class
// class Day{
//     public static final String MONDAY="MONDAY";
//     public static final String TUESDAY="TUESDAY";
//     public static final String WEDNESDAY="WEDNESDAY";
//     public static final String THURSDAY="THURSDAY";
//     public static final String FRIDAY="FRIDAY";
//     public static final String SATURDAY="SATURDAY";
//     public static final String SUNDAY="SUNDAY";
// }

// interface -> as we know in interface variable by default have public static final
// interface Day{
//     String MONDAY="MONDAY";
//     String TUESDAY="TUESDAY";
//     String WEDNESDAY="WEDNESDAY";
//     String THURSDAY="THURSDAY";
//     String FRIDAY="FRIDAY";
//     String SATURDAY="SATURDAY";
//     String SUNDAY="SUNDAY";
// }

// Enum
enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class a61Enum01 {
    public static void main(String[] args) {
        // System.out.println("SUNDAY");
        // System.out.println("MONDAY");
        // System.out.println("MONDAY");
        // System.out.println("MONDaY");
        // System.out.println("SUnDAY");

        // by class
        // System.out.println(Day.MONDAY);
        // // System.out.println(Day.MONDaY); // error
        // System.out.println(Day.MONDAY);
        // System.out.println(Day.TUESDAY);
        // // System.out.println(Day.TuESDAY); // error
        // System.out.println(Day.TUESDAY);

        // by interface
        // System.out.println(Day.MONDAY);
        // System.out.println(Day.TUESDAY);
        // System.out.println(Day.WEDNESDAY);
        // System.out.println(Day.THURSDAY);
        // System.out.println(Day.FRIDAY);
        // System.out.println(Day.SATURDAY);
        // System.out.println(Day.SUNDAY);

        // by Enum
        // System.out.println(Day.MONDAY);
        // System.out.println(Day.TUESDAY);
        // System.out.println(Day.WEDNESDAY);
        // System.out.println(Day.THURSDAY);
        // System.out.println(Day.FRIDAY);
        // System.out.println(Day.SATURDAY);
        // System.out.println(Day.SUNDAY);

        Day monday=Day.MONDAY; // Day referenceName= new Day("MONDAY")
        System.out.println(monday);

        int ordinal= monday.ordinal();
        System.out.println(ordinal);

        String mondayInString= monday.name();
        System.out.println(mondayInString);

        System.out.println(monday.toString().toLowerCase());

        Day enumDay= Day.valueOf("MONDAY");
        System.out.println(enumDay);

        System.out.println("Values for each");
        Day values[]= Day.values();
        for(Day i: values){
            System.out.println(i);
        }
    }
}

// enum Day{
//     MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
// }
public class a64Enum04 {
    public enum Month{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE
    }
    public static void main(String[] args) {
        // Day day=Day.MONDAY;
        // switch(day){
        //     // case MONDAY: {
        //     //     System.out.println("M");
        //     //     break;
        //     // }
        //     case MONDAY-> {System.out.println("M");}
        //     case TUESDAY-> {System.out.println("T");}
        // }

        Month month= Month.JANUARY;
        String res= switch(month){
            case JANUARY ->  "J";
            case FEBRUARY -> "F";
            default -> "Unknown!!";
        };
        System.out.println(res);
    }
}

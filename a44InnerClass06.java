// Local Inner Class

// A local inner class is defined within a method, typically within a 
// method body or block. Local inner classes 
// are not visible outside the method they are declared in and are often used when 
// a class is needed for a specific task within that method.
class Hotel{
    private String name;
    private int totalRoom;
    private int reservedRoom;

    public Hotel(String name, int totalRoom, int reservedRoom){
        this.name=name;
        this.totalRoom=totalRoom;
        this.reservedRoom=reservedRoom;
    }
    public void reserveRoom(String name, int numOfRoom){
        class ReservationValidator{
            public boolean validator(){
                if(name==null || name.isBlank()){
                    System.out.println("Name should not be empty");
                    return false;
                }
                else if(numOfRoom<0){
                    System.out.println("Number of room should be positive");
                    return false;
                }
                else if(reservedRoom+numOfRoom>totalRoom){
                    System.out.println("Sorry, Rooms is full!");
                    return false;
                }
                return true;
            }
        }
        ReservationValidator validate = new ReservationValidator();
        if(validate.validator()){
            reservedRoom+=numOfRoom;
            System.out.println("Reservation Confirmed for "+name+" for rooms "+numOfRoom);
        }
        else{
            System.out.println("Reservation failed, reserved room : "+reservedRoom);
        }
    }
}
public class a44InnerClass06 {
    public static void main(String[] args) {
        Hotel h1=new Hotel("Sunshine", 10,3 );
        h1.reserveRoom("Akram", 5);
        h1.reserveRoom("Marka", 2);
        h1.reserveRoom("", 2);
        h1.reserveRoom("Me", -32);
    }
}

// static inner class
// A static class inside another class; can only access static members of the outer class.
class Computer{
    private String brand;
    private String model;
    private OperatingSystem os;
    public OperatingSystem getOs(){
        return os;
    }
    public Computer(String brand, String model, String osName){
        this.brand=brand;
        this.model=model;
        this.os=new OperatingSystem(osName);
    }

    // rregular inner member class
    class OperatingSystem{
        private String osName;
        private OperatingSystem(String osName){
            this.osName=osName;
        }
      
        public void displayInfo(){
            System.out.println("Computer Model : "+model+", The os name is : "+osName);
        }
    }

    // static inner member class
    static class Usb{
        private String type;
        public Usb(String type){
            this.type=type;
        }
        public void displayInfo(){
            System.out.println("The Usb type is : "+type);
        }
    }
}
public class a42InnerClass04 {
    public static void main(String[] args) {     
        Computer c1=new Computer("Hp", "ABC","Win");
        c1.getOs().displayInfo();

        Computer.Usb usb1=new Computer.Usb("C");
        usb1.displayInfo();
    }
}

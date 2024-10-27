// An inner class is a class that is defined within another class. Inner classes are often used to 
// logically group classes that will be used only in one place and to increase encapsulation. 
// They have access to the members (including private ones) of the outer class they are nested in.

// 01. Member Inner Class
// : A non-static class inside another class; can access all members of the outer class.
class Car{
    String model;
    boolean isEngineOn;
    public Car(String model){
        this.model=model;
        isEngineOn=false;
    }
    class Engine{
        public void engineStart(){
            if(!isEngineOn){
                isEngineOn=true;
                System.out.println(model+" engine has started");
            }
            else{
                System.out.println(model+" is already start");
            }
        }
        public void engineStop(){
            if(isEngineOn){
                isEngineOn=false;
                System.out.println(model+" engine has stopped");
            }
            else{
                System.out.println(model+" egine is already stopped");
            }
        }
    }
}
public class a40InnerClass02 {
    public static void main(String[] args) {
        Car c1=new Car("Mercedes");
        Car.Engine engine= c1.new Engine();
        engine.engineStart();
        engine.engineStop();
    }
}

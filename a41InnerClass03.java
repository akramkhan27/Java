// Without Member Inner Class
class Car{
    private String model;
    boolean isEngineOn;

    public Car(String model){
        this.model=model;
        isEngineOn=false;
    }
    public String getModel() {
        return model;
    }
    
}
class Engine{
    private Car car;

    public Engine(Car car){
        this.car= car;
    }
    public void start(){
        if(!car.isEngineOn){
            car.isEngineOn=true;
            System.out.println(car.getModel()+ " Engine started");
        }
        else{
            System.out.println(car.getModel()+" Engine is already start");
        }
    }
    public void stop(){
        if(!car.isEngineOn){
            System.out.println(car.getModel()+ " Engine is already Stop");
        }
        else{
            System.out.println(car.getModel()+" Engine is stopped");
        }
    }
}
public class a41InnerClass03 {
    public static void main(String[] args) {
        Car c1=new Car("Lambu");
        Engine engineC1=new Engine(c1);
        engineC1.start();
        engineC1.stop();
    }
}

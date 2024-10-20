// Encapsulation

class car{
    private String brand;
    private String model;
    private String color;
    private int speed;
    private int year;

    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }

    public void accelerate(int increment){
        speed+=increment;
    }
    public void brake(int decrement){
        speed-=decrement;
        if(speed<0){
            speed=0;
        }
    }
}

public class a13Oops01{
    public static void main(String[] args){
        car car1=new car();
        car1.setBrand("Tata");
        car1.setModel("Safari");
        car1.setColor("Blue");
        car1.setYear(2024);
        car1.setSpeed(50);

        car1.accelerate(10);
        System.out.println(car1.getSpeed());
        car1.brake(10);
        System.out.println(car1.getSpeed());

    }
}
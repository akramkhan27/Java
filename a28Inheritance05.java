// Multiple-Inheritance 
// this type of inheritance is not achievable in java
// Multiple inheritance is not supported in Java with classes to avoid the Diamond Problem, 
// which can create ambiguity and confusion. 
// Java allows a class to inherit from only one parent class at a 
// time to keep the design simple and straightforward.

// What is the Diamond Problem?
// The Diamond Problem occurs when a class inherits from two or more parent classes, 
// and both parent classes have a method with the same name. 
// The child class would get confused about which method to inherit or call. 
// This can lead to errors and conflicts in the code.

class MusicPlayer{
    public void powerOn(){
        System.out.println("Starting the music player..");
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
class Phone{
    public void powerOn(){
        System.out.println("Starting the music player..");
    }
    public void calling(){
        System.out.println("Calling...");
    }
}
class Camera{
    public void powerOn(){
        System.out.println("Starting the music player..");
    }
    public void takePicture(){
        System.out.println("Clicked the picture");
    }
}
// class SmartPhone extends MusicPlayer, Phone, Camera{// error because not support multiple inheritance

// }
class SmartPhone extends MusicPlayer{

}

public class a28Inheritance05 {
    public static void main(String[] args){
        SmartPhone s1= new SmartPhone();
        s1.playMusic();
        s1.powerOn();
    }
}

// How Does Java Solve This?
// Java solves this problem by not supporting multiple inheritance with classes. 
// Instead, Java allows multiple inheritance through interfaces. 
// Interfaces only declare methods without implementing them, 
// so there is no ambiguity when a class implements multiple interfaces.

// In Inheritance we learn :
// Inheritance, Types of Inheritance, Method Overriding , Constructor Chaining, super keyword, annotation (like Override) and 
// Diamond problem in Multiple Inheritance
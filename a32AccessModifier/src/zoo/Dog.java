package zoo;
// protected in subclass
public class Dog extends Animal{
    public Dog(String name){
        super(name, "Bark");
    }
    public void wagTail(){
        System.out.println(getName()+ " is wagging its tail.");
    }
    private String getName(){
        return getClass().getSimpleName();
//        getClass() is a method from the (Object) class
//        that returns the runtime class of the object.
//        getSimpleName() is a method from the (Class) class that gives the
//        simple name of the class, which is just the class name itself, without any package information.

//        getClass().getSimpleName(): Returns only the class name (e.g., Dog).
//        getClass().getName(): Returns the full name including the package (e.g., com.example.Dog).
//        getClass().getCanonicalName(): Also returns the full name, including the package, but handles inner classes in a readable way.
    }


    public void setDogSound(String newsound){
        changeSound(newsound);
    }

}

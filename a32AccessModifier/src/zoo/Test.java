package zoo;
// protected in same package without subclass
public class Test {
    public static void main(String[] args) {
        Dog d1=new Dog("Bob");
        d1.makeSound();
        d1.wagTail();
        d1.changeSound("Meow!!"); // no error -> Same package
        d1.setDogSound("Boooh!");
        d1.makeSound();
    }
}

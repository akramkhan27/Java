package zoo;

public class Animal {
    private String name;
    protected String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name+" make a sound : "+sound);
    }
    protected void changeSound(String sound){
        this.sound=sound;
    }

}

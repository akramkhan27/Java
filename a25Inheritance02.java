// multi level Inheritance
// When a class is derived from another derived class (a chain of inheritance).
class GrandParent{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
class Parent extends GrandParent{

}
class Child extends Parent{

}
public class a25Inheritance02 {
    public static void main(String[] args){
        Child c1=new Child();
        c1.setName("Akram Khan");
        c1.setAge(23);
        System.out.println(c1.getName());
        System.out.println(c1.getAge());

        Parent p1=new Parent();
        p1.setName("Mustaq Khan");
        p1.setAge(55);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        GrandParent g1=new GrandParent();
        g1.setName("Habibul Khan");
        g1.setAge(90);
        System.out.println(g1.getName());
        System.out.println(g1.getAge());
    }
}

public class a7String01 {
    public static void main(String[] args) {
        // String is a Sequence of characters
        
        // in String variable store the address of memory where value is there located in heap
        String c= new String("akram"); // it takes memory on heap(beacuse String is class)
        // for every value it create different memory in heap
        String d= new String("akram");
        // == operator check reference of variable not value
        System.out.println(c==d);
        
        String a="akram"; // it also takes memory on heap(beacuse String is class) but in String pool (when we are creating without new)
        // it does store duplicate value (for duplicate value it does not create separate memory in String pool)
        String b="akram";
        System.out.println(a==b);
        System.out.println(c==d);

    }
}

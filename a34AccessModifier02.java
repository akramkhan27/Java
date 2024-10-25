class Utils{
    public static int max(int n1, int n2){
        if(n1>n2){
            return n1;
        }
        return n2;
        
    }
    public static int min(int n1, int n2){
        if(n1<n2){
            return n1;
        }
        return n2;
        
    }
    public static String trimAndUpperCase(String val){
        if(val!=null){
            return val.trim().toUpperCase();
        }
        return "";
    }
}
public class a34AccessModifier02 {
    public static void main(String[] args) {
        System.out.println(Utils.max(2,3));
        System.out.println(Utils.min(2,3));
        System.out.println(Utils.trimAndUpperCase("   Akram Khan  "));
    }
}

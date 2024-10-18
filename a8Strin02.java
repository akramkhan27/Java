// Methods of String

public class a8Strin02 {
    public static void main(String[] args){
        // String is immutable 
        // if we done operation on string using method it creates new string but not change actual one

        // length()
        String name="Akram Khan";
        // System.out.println(name.length());

        // charAt()
        // System.out.println(name.charAt(6));
        // System.out.println(name.charAt(name.length()-1));

        // equals()
        // == check equality in primitive data types but in non-primitive == check the references
        String name01="Akram Khan";
        // System.out.println(name.equals(name01));
        String name02="Akram khan";
        // System.out.println(name01.equals(name02));
        // System.out.println(name01.equalsIgnoreCase(name02));

        // compareTo()
        // it compares char of string one by one from start
        // if any character mismatch than done the subtraction and return the value 
        // if no mismatch character than return 0
        String value01="marka";
        String value02="merka";
        // System.out.println('a'+0);
        // System.out.println('e'+0);
        // value01- value02 of character ASCII value if mismatch is there
        // System.out.println(value01.compareTo(value02));

        // value02- value01 of character ASCII value if mismatch is there
        // System.out.println('e'+0);
        // System.out.println('a'+0);
        // System.out.println(value02.compareTo(value01));

        // no mismatch character in below strings
        String value03="marka";
        String value04="marka";
        // System.out.println(value03.compareTo(value04));
        
        String value05="mArka";
        String value06="marka";
        // System.out.println(value05.compareTo(value06));
        // System.out.println(value05.compareToIgnoreCase(value06));

        // subString() and subSequence is same in java they provide continues sub part of string
        String station01="Nagpur";
        // System.out.println(station01.substring(3));
        // System.out.println(station01.substring(2,5)); // startindex is included but endindex is excluded
        // System.out.println(station01.substring(2,5));
        // System.out.println(station01.substring(2, station01.length()));
        // System.out.println(station01.subSequence(2,5));

        // toUpperCase()
        String station02="Mumbai Express";
        // System.out.println(station02.toUpperCase());
        // System.out.println(station02.toLowerCase());

        // trim()
        String people="      Akram Khan        ";
        // System.out.println(people);
        // System.out.println(people.trim());

        // replace()
        String people01= "Akram Khan";
        // System.out.println(people01.replace("Khan","Pathan"));
        String people02= "Khan Akram Khan Khan";
        // System.out.println(people02.replace("Khan","Pathan"));
        // System.out.println(people01.replace("a","e").toUpperCase());
        // System.out.println(people01.replace('a','e').toUpperCase());

        // contains()
        String country="India";
        // System.out.println(country.contains("a"));
        // System.out.println(country.contains("dia"));
        // System.out.println(country.contains("nia"));

        // startsWith() and endsWith()
        String firstName="Akram Khan";
        // System.out.println(firstName.startsWith("Ak"));
        // System.out.println(firstName.startsWith("kh"));

        // System.out.println(firstName.endsWith("an"));
        // System.out.println(firstName.endsWith("Ak"));

        // isEmpty() and isBlank()
        String random01="";
        // System.out.println(random01.isEmpty());
        String random02=" ";
        // System.out.println(random02.isEmpty());
        // System.out.println(random02.isBlank());

        // indexOf()
        String me01="Akram Khan";
        // System.out.println(me01.indexOf("a"));
        // System.out.println(me01.indexOf("Khan"));
        // System.out.println(me01.indexOf("a", 5));
        // System.out.println(me01.lastIndexOf("a"));

        // valueOf() Anydatatype to String
        int number=10;
        String s= String.valueOf(number);
        // System.out.println(s);

        // format()
        String sentence= String.format("My name is %s and my Age is %d","Akram",23);
        // System.out.println(sentence);
    }
}

// Primitive Datatypes

public class a2DataTypes {
    public static void main(String[] args){
        // Integral Number
        // byte
        // short
        // int
        // long

        // byte age01=127;
        // System.out.println(Byte.MIN_VALUE);
        // System.out.println(Byte.MAX_VALUE);

        // short age02=32767;
        // System.out.println(Short.MIN_VALUE);
        // System.out.println(Short.MAX_VALUE);

        // int age03=2147483647;
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        // if the value is greater from the max value of integer and storing in the
        // long datatypes then we have specify the 'l' in  the end of value 

        // long age04=4365365424343l; 
        // System.out.println(Long.MIN_VALUE);
        // System.out.println(Long.MAX_VALUE);


        // Decimal Number
        // float
        // double
        // float score01=323.3233232323f;
        // double score02=323.3233232323;

        // System.out.println(score01);
        // System.out.println(score02);

        // System.out.println(Float.MIN_VALUE);
        // System.out.println(Float.MAX_VALUE);

        // System.out.println(Double.MIN_VALUE);
        // System.out.println(Double.MAX_VALUE);

        // Characters
        // char
        // char value01='a';
        // int value02=value01;
        // System.out.println(value01);
        // System.out.println(value02);

        // value01= (char) 95;
        // System.out.println(value01);

        // System.out.println(Character.MIN_VALUE);
        // System.out.println(Character.MAX_VALUE);

        // System.out.println((int) Character.MIN_VALUE);
        // System.out.println((int) Character.MAX_VALUE);

        // ASCII VAlue

        // for(int i=0;i<=127;i++){
        //     System.out.println((char) i);
        // }

        // Boolean
        // boolean

        boolean isElgible=true;
        boolean isLoggedIn=false;
        // System.out.println(isElgible);
        // System.out.println(isLoggedIn);


        // Implicit/Widening/Automatic and Explicit/Narrowing conversion

        // Implicit example : where typecasting done automatically

        // byte temp01=12; // 1 byte
        // short temp02=temp01; // 2 byte // conversion from byte to short
        // int temp03=temp02; // 4 byte // conversion from short to int
        // long temp04=temp03; // 8 byte // conversion from int to long
        // float temp05= temp03; // 4 byte  // conversion from int to float
        // // due to scientific notation (which is 10 power of something like value)property i.e why it can hold long value
        // temp05= temp04; // conversion from long to floar

        // float val01=3232.3223f; // 4 byte 
        // double val02=val01; // 8 byte // conversion from float to double

        // char charValue='A';
        // int intValue=charValue; // widening conversion from char to int
        // System.out.println(intValue);

        // char charValue='A';
        // float floatValue=charValue; // widening conversion from char to float
        // System.out.println(floatValue);

        // Explicit conversion: we have to manually convert the variable or typecast it 

        // float a=23.4f;
        // int b= (int) a; // Explicit converion from float to int
        // System.out.println(a);
        // System.out.println(b);

        // double doubleValue=2343432.23;
        // float floatValue=(float) doubleValue; // narrowing conversion from double to float
        // long longValue=(long) floatValue;
        // int intValue= (int) longValue;

        // System.out.println("double "+doubleValue);
        // System.out.println("float "+floatValue);
        // System.out.println("long "+longValue);
        // System.out.println("int "+intValue);

        // first bit represent the + and - value 
        long longVal=Long.MAX_VALUE; // 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        int intVal=(int)longVal; // 11111111 11111111 11111111 11111111
        System.out.println(intVal);

        System.out.println(Integer.toBinaryString(434343));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println(Integer.toBinaryString(-1));







    }
}

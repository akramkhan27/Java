public class a5BitwiseOperator {
    public static void main(String[] args) {
        // Computer-> 0 1
        int number=5;
        // System.out.println(Integer.toBinaryString(number)); // 101
        // 00000000 00000000 00000000 00000101

        // operand-> byte short int long (Btwise not done on decimals numbers)

        // Bitwise Operator :

        // and (&)
        // or (|)
        // xor (^)
        // not (~)
        // left shift (<<)
        // right shift (>>)
        // unsigned right shift (>>>)

        // &
        // any bit 0 than answer is 0 if both bit 1 than answer is 1
        // int a=5;
        // int b=4;
        // System.out.println(a&b);
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(b));

        // |
        // both bit 0 than answer is 0 if any bit 1 than answer is 1
        // int a=5;
        // int b=4;
        // System.out.println(a|b);
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(b));

        // ^
        // both bit is same than answer is 0 if both bit different than answer is 1
        // int a=5;
        // int b=4;
        // System.out.println(a^b);
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(b));

        // ~
        // in not only one operand participate
        // it convert bit 1 in 0 and 0 to 1
        // int a=5;
        // int value=~a;
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(value));

        // <<
        // it shift the bit to left and vacant space from front added with 0
        // int a=5;
        // int value=a<<1;
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(value));
        // System.out.println(a);
        // System.out.println(value);

        // >>
        // it shift the bit to right and vacant space from behind added with 0
        // int a=5;
        // int value=a>>1;
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(value));
        // System.out.println(a);
        // System.out.println(value);

        // >>
        // it shift the bit to right and vacant space from behind added with 0
        // on negative value right shift does not change 0 to 1 from behind (so negative value preserve in right shift case
        //  but in unsigned right shift operator case it changes the value of bit from behind 1 to 0 then that last 0 now represent positive value)
        // int a=-5;
        // int value=a>>1;
        // System.out.println(Integer.toBinaryString(a));
        // System.out.println(Integer.toBinaryString(value));
        // System.out.println(a);
        // System.out.println(value);

        // >>>
        int a=-5;
        int value=a>>>1;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(value));
        System.out.println(a);
        System.out.println(value);

    }
}

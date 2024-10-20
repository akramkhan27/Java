class Cat{
    String name;
}

public class a17Methods {
    public static void main(String[] args){
        // int[] accountArray01={6,3,2,7,9,2,1,4};
        // int res01=sumOfArray(accountArray01);
        // System.out.println(res01);

        // int[] accountArray02={1,2,3,4,5};
        // int res02=sumOfArray(accountArray02);
        // System.out.println(res02);

        // String custom function
        // String name= upperFunc("     Akram   ");
        // System.out.println(name);

        // method overloading
        // System.out.println(sumOfNum(1, 2));
        // System.out.println(sumOfNum(1,2,3));

        // mutable and immutable
        // immutable -> because copy of value passed to parameter
        int x=5;
        int value=temp01(x);
        // System.out.println(value);
        // System.out.println(x);

        // String is object and in this reference is passed bit
        // in string we know it creates another object if we apply any changes because of
        // string pool and refer it

        // String name="Akram";
        // String name01=temp02(name);
        // // System.out.println(name);
        // // System.out.println(name01);

        // mutable
        // create class of Cat

        // Cat cat1=new Cat();
        // cat1.name="Giyan";
        // System.out.println(cat1.name);
        // // Cat cat2=temp03(cat1);
        // // System.out.println(cat2.name);
        // System.out.println(cat1.name);

        // Cat cat1=new Cat();
        // cat1.name="Giyan";
        // System.out.println(cat1.name);
        // temp04(cat1);
        // System.out.println(cat1.name);

        // variable args
        // System.out.println(varArgs(1,2,3));
        // System.out.println(varArgs(1,2,3,4));
        // System.out.println(varArgs(1,2,3,4,5));

        // check prime number
        // int number01=6;
        int number01=8;
        boolean check= checkPrime(number01);
        if(check){
            System.out.println("number : "+number01+" is as Prime Number");
        }
        else{
            System.out.println("number : "+number01+" is not Prime Number");
        }

        // command line argument

        // public static void main(String[] args){
        // public static void main(String... args){
            // suppose in command line we pass this ->Hello 1
            // System.out.println(args[0])
            // System.out.println(args[1])
            // Output: Hello
            //         1
        // }

        
    }

    // public static void sumOfArray(int[] arr){
    //     int res=0;
    //     for(int element: arr){
    //         res+=element;
    //     }
    //     System.out.println(res);
    // }
    public static int sumOfArray(int[] arr){
        int res=0;
        for(int element: arr){
            res+=element;
        }
        return res;
    }

    private static String upperFunc(String name){
        return name.trim().toUpperCase();
    }

    // Method overloading
    // if we want to achieve method overloading than multiple method name should be same 
    // but number of parameter and types of parameter different with respect to other method
    // method signature include only method name and parameter lists
    private static int sumOfNum(int num1, int num2){
        return num1+num2;
    }
    private static int sumOfNum(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    // mutable and immutable

    private static int temp01(int x){
        return x+=10;
    }
    private static String temp02(String name){
        return name.toUpperCase();
    }
    // private static Cat temp03(Cat cat2){
    //     cat2.name="Mika";
    //     return cat2;
    // }
    private static void temp04(Cat cat2){
        cat2.name="Mika";
    }

    // variable args
    private static int varArgs(int ...num){
        int sum=0;
        for(int element: num){
            sum+=element;
        }
        return sum;
    }

    // check prime number
    private static boolean checkPrime(int number01){
        int count=0;
        for(int i=1;i<= number01/2; i++){
            if(number01%i==0){
                count++;
            }
        }
        return count==1;
    }
}

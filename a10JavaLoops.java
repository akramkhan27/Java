public class a10JavaLoops {
    public static void main(String[] args){
        // while loop
        // int i=0;
        // while(i<10){
        //     System.out.println("Hello world");
        //     i++;
        // }

        // do while
        // int i=1;
        // do{
        //     System.out.println(i);
        //     i++;
        // } while(i<=10);

        // for loop
        // for(int j=0;j<=5;j++){
        //     System.out.println(j);
        // }

        // for(int j=1;j<=100000;j*=10){
        //     System.out.println(j);
        // }

        // for(int i=1, j=1;j<=6; i*=10, j++){
        //     System.out.println(i);
        // }

        // print table 7
        // for(int i=1; i<=10;i++){
        //     System.out.println("7 x "+i+" = "+(7*i));
        // }

        // sum of first 10 natural numbers
        // int sum=0;  
        // for(int i=1;i<=10;i++){
        //     sum+=i;
        // }
        // System.out.println(sum);

        // count digits
        // int num=43323234;
        // int res=0;
        // while(num>0){
        //     num/=10;
        //     System.out.println(num);
        //     res++;
        // }
        // System.out.println(res);

        // factorial
        // 5.4.3.2.1
        // int value=5;
        // int result=1;
        // while(value>0){
        //     result*=value;
        //     value--;
        // }
        // System.out.println(result);

        // nested for loop
        // int result01=0;
        // for(int i=0;i<10;i++){
        //     for(int j=0;j<10;j++){
        //         result01++;
        //     }
        // }
        // System.out.println(result01);

        // print patter
        // *
        // **
        // ***
        // ****
        // *****
        // ******

        // for(int i=0;i<6;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // break
        // it help to break the nearest loop or exit from iteration
        int j=0;
        while(j<=10){
            if(j==5){
                break;
            }
            System.out.println(j);
            j++;
        }

        // continue
        // it skips the present iteration and jump to next iteration
        // in while loop we have to write updation explicitly before continue but not in for loop
        int k=0;
        while(k<=10){
            if(k==5){
                k++;
                continue;
            }
            System.out.println(k);
            k++;
        }

        for(int z=0;z<=10;z++){
            if(z==5){
                continue;
            }
            System.out.println(z);
        }

    }
}

public class a11Array {
    public static void main(String[] args){
        // int integerArray[]={1,2,3,4,5};
        // int []integerArray={1,2,3,4,5};
        int[] integerArray={1,2,3,4,5};

        int[] myArray= new int[10];
        // by default 0 value is there if we don't givve value during declaration
        // for(int i=0;i<myArray.length;i++){
        //     System.out.println(myArray[i]);
        // }

        myArray[3]=100;
        myArray[7]=200;
        // for(int i=0;i<myArray.length;i++){
        //     System.out.println(myArray[i]);
        // }

        // for each loop
        int[] myArray01={20,30,40,50};
        // for(int element: myArray01){
        //     System.out.println(element);
        // }
        
        // search an element in an Array
        // int[] myArray02={20,30,40,50};
        // for(int element: myArray02){
        //     if(element==31){
        //         System.out.println("Found");
        //     }
        // }
        
        // find max element
        int[] myArray03={20,-30,400,5};
        int res=Integer.MIN_VALUE;
        // for(int i=0;i<myArray03.length;i++){
        //     if(res<myArray03[i]){
        //         res=myArray03[i];
        //     }
        // }
        // System.out.println(res);

        // reverse an array
        // int[] myArray04= {43, 7, 6, 32, 98, 12, 544, 768};
        // for(int i=myArray04.length-1,j=0;i>=0;i--){
        //     System.out.println(myArray04[i]);
        // }

        // Sum of array
        int[] myArray05={1,2,3,4,5};
        int sum=0;
        // for(int i=0;i<myArray05.length; i++){
        //     System.out.println(myArray05[i]);
        //     sum+=myArray05[i];
        // }
        // System.out.println(sum);

        // 2-D Array
        int[][] newArray= new int[3][3];

        int[][] newArray01={{1,2,3},{4,5,6},{7,8,9}};
        // for(int i=0;i<newArray01.length;i++){
        //     for(int j=0;j<newArray01[i].length; j++){
        //         System.out.print(newArray01[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        char arr[][]=new char[3][3];
        arr[0][0]='a';
        arr[0][1]='b';
        arr[1][0]='c';
        arr[1][1]='d';
        arr[2][0]='e';
        arr[2][1]='f';
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // jagged array -> arrays of array with different length
        char[][] newMyArray= new char[3][];
        newMyArray[0]=new char[2];
        newMyArray[1]=new char[3];
        newMyArray[2]=new char[2];

        newMyArray[0][0]='a';
        newMyArray[0][1]='b';
        newMyArray[1][0]='c';
        newMyArray[1][1]='d';
        newMyArray[1][2]='e';
        newMyArray[2][0]='f';
        newMyArray[2][1]='g';
        for(int i=0; i<newMyArray.length; i++){
            for(int j=0; j<newMyArray[i].length; j++){
                System.out.print(newMyArray[i][j]+" ");
                
            }
            System.out.println();
        }


    }
}

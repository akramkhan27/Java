public class a9ConditionalStat {
    public static void main(String[] args) {
        // relational operator
        // it compares to values and return boolean result
        // >, <, >=, <=, !=, ==
        int a=1;
        int b=2;

        // System.out.println(a>b);
        // System.out.println(a<b);
        // System.out.println(a>=b);
        // System.out.println(a<=b);
        // System.out.println(a!=b);
        // System.out.println(a==b);

        // Logical Operator
        // it compares evaluates two boolean expressions except !
        // &&, ||, !

        int age=18;
        int marks=50;

        // System.out.println(marks>=35 && age>=18);

        // short circuit in && if first ecpression false then does not check another expression
        // short circuit in || if first ecpression true then does not check another expression
        String name="akram";
        int exp=2;
        boolean tier1=true;
        // System.out.println(tier1 || exp>=5); // short circuit in ||
        // System.out.println(exp>=3 && tier1); // short circuit in &&

        // System.out.println(!(1>3));

        // Conditional 
        // if,elseif, else, switch
        int age01=20;
        int marks01=40;
        // if(age>=18){
        //     System.out.println("You are adult");
        // }

        // if(age>=20){
        //     System.out.println("You are adult");
        // }
        // else{
        //     System.out.println("You are Child");
        // }

        // if else with logical operator
        // if(age>=18 && marks01>=30){
        //     System.out.println("Congrats");
        // }
        // else{
        //     System.out.println("Oops!");
        // }

        // else if
        // int percentage=95;
        // if(percentage>=90){
        //     System.out.println("A");
        // }
        // else if(percentage>=70){
        //     System.out.println("B");
        // }
        // else if(percentage>=60){
        //     System.out.println("C");
        // }
        // else{
        //     System.out.println("D");
        // }

        // int day=6;
        // if(day==1){
        //     System.out.println("Monday");
        // }
        // else if(day==2){
        //     System.out.println("Tuesday");
        // }
        // else if(day==3){
        //     System.out.println("Wednesday");
        // }
        // else if(day==4){
        //     System.out.println("Thursday");
        // }
        // else if(day==5){
        //     System.out.println("Friday");
        // }
        // else if(day==6){
        //     System.out.println("Saturday");
        // }
        // else if(day==7){
        //     System.out.println("Sunday");
        // }
        // else{
        //     System.out.println("Invalid Input");
        // }

        // switch case
        // this datatype can only used by switch case
        // byte, short,char, int, String, Enum types
        int day01=5;
        switch(day01){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:
                System.out.println("Invalid Input");
        }

    }
}

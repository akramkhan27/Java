
public class a4ArithmeticOperator {
    public static void main(String[] args){
        int salary=10000;
        int incentive=500;
        int deduction=500;

        int monthly= salary+incentive;
        // System.out.println(monthly);

        monthly= salary-deduction;
        // System.out.println(monthly);

        int yearly= salary*12;
        // System.out.println(yearly);

        int perChild= yearly/3;
        // System.out.println(perChild);

        int a=4;
        int b=3;
        // System.out.println(a%b);

        // Operator precedence: Java operators are evaluated based on their precedence level. For example, 
        // multiplication (*) has higher precedence than addition (+), so in an expression like 2 + 3 * 4,
        //  the multiplication is done first, resulting in 2 + 12 = 14.

        // Associativity: When two operators of the same precedence appear in an expression, 
        // associativity defines the order of evaluation:

        // Left-to-right associativity: Most operators (e.g., +, -, *, /) are left-associative, 
        // meaning they are evaluated from left to right.

        // Example: 10 - 5 - 2 is evaluated as (10 - 5) - 2.
        // Right-to-left associativity: Some operators (e.g., assignment = and ternary ?:) are right-associative,
        //  meaning they are evaluated from right to left.
        // Example: a = b = 5 is evaluated as a = (b = 5).

        // compound assignment operators
        int num01=10;
        // num01=num01+1;
        // System.out.println(num01);
        // num01=num01+1.5f; //error 
        // System.out.println(num01);
        
        
        // num01+=1.5f; // implicit typecasting done in compound assignment
        // System.out.println(num01);

        // num01*=10;
        // System.out.println(num01);

        // num01/=10;
        // System.out.println(num01);

        // num01-=3;
        // System.out.println(num01);

        // num01%=6;
        // System.out.println(num01);


        // Increment And Decrement Operator
        // post increment -> value used first than increment
        // post drecrement -> value used first than decrement
        // pre increment -> increment done first than value used
        // pre decrement -> decrement done first than value used

        int card=1;
        // card++;
        // System.out.println(card);

        // ++card;
        // System.out.println(card);

        // card--;
        // System.out.println(card);

        // --card;
        // System.out.println(card);

        // int bank= card++;
        // System.out.println(bank);

        // int bank = ++card;
        // System.out.println(bank);

        // int bank= card--;
        // System.out.println(bank);

        // int bank= --card;
        // System.out.println(bank);

        // int bank= card++ + card;
        // System.out.println(bank);

        // int bank= ++card + card;
        // System.out.println(bank);

        // int bank = card+ ++card;
        // System.out.println(bank);

        // int bank = card+ card++;
        // System.out.println(bank);


    }
}

// Anonymous Inner class

// An anonymous inner class is an inner class without a name, 
// often used to provide a quick implementation for an interface or an 
// abstract class on the spot. They are usually used for event handling 
// or providing implementations of functional interfaces.

interface Payment{
    void pay(double amount);
}
// class CreditCard implements Payment{
//     private int cardNumber;
//     public CreditCard(int cardNumber){
//         this.cardNumber=cardNumber;
//     }

//     @Override
//     public void pay(double amount){
//         System.out.println("The Amount Paid "+amount+" using Credit Card is : "+cardNumber);
//     }
// }
class ShoppingCart{
    private double totalAmount;
    public ShoppingCart(double totalAmount){
        this.totalAmount=totalAmount;
    }
    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}
public class a43InnerClass05 {
    public static void main(String[] args) {
        ShoppingCart s1=new ShoppingCart(100);
        // CreditCard c1=new CreditCard(2345);
        // s1.processPayment(c1);;

        s1.processPayment(new Payment(){
            @Override
            public void pay(double amount){
                System.out.println("Payed amount "+amount+" using credit card");
            }
        });

        ShoppingCart s2=new ShoppingCart(200);
        s2.processPayment(new Payment(){
            @Override
            public void pay(double amount){
                System.out.println("Payed amount "+amount+" using Paypal");
            }
        });
    }
}

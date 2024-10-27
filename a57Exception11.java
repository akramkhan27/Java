// Example of a Custom Unchecked Exception

class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class BankAccount{
    private int balance;
    public BankAccount(int balance){
        this.balance=balance;
    }
    public void withdraw(int amount){
        if(balance<amount){
            throw new InsufficientBalanceException("Insufficient Balance : "+balance);
        }
        else{
            balance-=amount;
            System.out.println("Succussfully Withdraw amount : "+amount);
            System.out.println("Balance is : "+balance);
        }
    }
}
public class a57Exception11 {
    public static void main(String[] args) {
        BankAccount c1=new BankAccount(100);
        try{
            c1.withdraw(101);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
    }
}

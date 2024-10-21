class Bank{
    private int accountNumber;
    private int balance;

    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount Deposit "+amount+" Successfully");
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Amount Withdraw "+amount+" Successfully");
        }
        else{
            System.out.println("Invalid Amount or insufficient balance");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

}
public class a22Encapsulation02 {
    public static void main(String[] args){
        Bank customer01=new Bank();
        customer01.setAccountNumber(1001);
        customer01.deposit(-10);
        customer01.withdraw(10);
        customer01.deposit(10);
        customer01.withdraw(5);
        System.out.println(customer01.getBalance());
    }
}

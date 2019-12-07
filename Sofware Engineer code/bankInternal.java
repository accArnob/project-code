import java.util.Scanner;
 
class bankInternal 
{
    int account;
    float balance=0;
    Scanner get = new Scanner(System.in);
    bankInternal()
    {
        System.out.println("Enter Account Number:");
        account = get.nextInt();
        //System.out.println("Enter Initial Balance:");
        //balancea = get.nextFloat();        
    }
    void deposit()
    {
        float d_amount;
        System.out.println("Enter Amount to be Deposited:");
        d_amount = get.nextFloat();
        balance = balance + d_amount;
        System.out.println("Deposited! Account Balance is "+balance);
    }
}
    
 
public class Bank 
{
    public static void main(String[] args)
    {
        bankInternal myObj = new bankInternal();
        myObj.deposit();
      //  myObj.withdraw();       
    }
}
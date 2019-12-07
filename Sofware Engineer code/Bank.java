import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bank
{
	private DebitAccount acc[] = new DebitAccount[100];
	private int count = 0;
	
	Bank(){
		
	}
	public void creat_Account ()
	{
		String name;
		String nominee;
		String DateOfBirth;
		double maxLimit;
		double transectionLimit;
		int d,m,y;
		String newDate;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = in.nextLine();
		System.out.println("Enter Day: ");
		d = in.nextInt();
		System.out.println("Enter Month: ");
		m = in.nextInt();
		System.out.println("Enter Year: ");
		y = in.nextInt();
		
		newDate = d+"-"+m+"-"+y;
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yy");
		Date d1 = sdf1.parse(newDate);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
		Date d2 = sdf.format(d1);
		//System.out.println("Enter Date of Birth: ");
		//DateOfBirth = in.nextLine();
		
		System.out.println("Enter Nominee: ");
		nominee = in.nextLine();
		System.out.println("Enter Maximum Balance: ");
		maxLimit = in.nextDouble();
		System.out.println("Enter Maximum Daily Transaction Limit: ");
		transectionLimit = in.nextDouble();
		
		DebitAccount newAccount = new DebitAccount(name,DateOfBirth,nominee,maxLimit,transectionLimit);
		this.acc[count] = newAccount;
		count++;
	}
	public void printAccountInfo()
	{
		for(int x=0; x<this.count; x++);
		{
			System.out.println("Enter Deposit Amount: ");
			depositAmount = in2.nestDouble();
			acc[x].Deposit(depositAmount);
			acc[x].printAccount();
		}
	}
	public void withdraw()
	{
		double withdrawAmount;
		Scanner in3 = new Scanner(System.in);
		for(int i=0; x<this.count; x++)
		{
			System.out.println("Enter Withdraw Amount: ");
	        withdrawAmount = ni3.nextDouble();
			acc[x].Withdraw(withdrawAmount);
			acc[x].printAccount();
		}
	}
}
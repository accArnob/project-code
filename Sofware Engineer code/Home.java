import java.util.Scanner;

public class Home
{
	public void creatAccount()
	{
		System.out.println(">>> PRESS 1 FOR CREATE DEBIT ACCOUNT.");
		System.out.println(">>> PRESS 2 FOR CREATE CREDIT ACCOUNT.");
		System.out.println(">>> PRESS 3 FOR CREATE SAVINGS ACCOUNT.");
		System.out.println(">>> PRESS 4 FOR UPDATE ACCOUNT.");
		System.out.println(">>> PRESS 5 FOR SHOW OWN ACCOUNT INFORMATION.");
		System.out.println(">>> PRESS 6 FOR SHOW ACCOUNT HISTORY.");
		
		int i;
		
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		
		switch(i)
		{
			case 1:
			
			Scanner d_input = new Scanner(System.in);
			System.out.println();
			
			System.out.println("ENTER NAME: ");
			String d_name = d_input.nextLine();
			
			System.out.println("ENTER DOB: ");
			String d_dob = d_input.nextLine();
			
			System.out.println("ENTER NOMINEE: ");
			String d_nominee = d_input.nextLine();
			
			System.out.println("ENTER BALANCE: ");
			String d_balance = d_input.nextDouble();
			
			Account d_obj = new Debit(d_name, d_dob, d_nominee, d_balance);
			
			System.out.println();
			
			d_obj.printAccount();
			
			break;
			
			case 2:
			
			Scanner c_input = new Scanner(System.in);
			System.out.println();
			
			System.out.println("ENTER NAME: ");
			String c_name = c_input.nextLine();
			
			System.out.println("ENTER DOB: ");
			String c_dob = c_input.nextLine();
			
			System.out.println("ENTER NOMINEE: ");
			String c_nominee = c_input.nextLine();
			
			System.out.println("ENTER BALANCE: ");
			String c_balance = c_input.nextDouble();
			
			Account c_obj = new Debit(c_name, c_dob, c_nominee, c_balance);
			System.out.println();
			
			c_obj.printAccount();
			
			break;
			
			case 3:
			
			Scanner s_input = new Scanner(System.in);
			System.out.println();
			
			System.out.println("ENTER NAME: ");
			String s_name = s_input.nextLine();
			
			System.out.println("ENTER DOB: ");
			String s_dob = s_input.nextLine();
			
			System.out.println("ENTER NOMINEE: ");
			String s_nominee = s_input.nextLine();
			
			System.out.println("ENTER BALANCE: ");
			String s_balance = s_input.nextDouble();
			
			Account s_obj = new Debit(s_name, s_dob, s_nominee, s_balance);
			System.out.println();
			
			s_obj.printAccount();
			
			break;
			
			case 4:
			
			System.out.println(" This Is Case 4.");
			break;
			
			case 5:
			
			System.out.println(" This Is Case 5.");
			break;
			
			case 6:
			
			System.out.println(" This Is Case 6.");
			break;
			
			default:
			
			System.out.println("Invalid Input.");
		}
	}
}
public class Savings extends Account 
{	
	public Savings()
	{
		
	}
	public Savings(String name, String nominee, double balance)
	{
		super(name, DOB, nominee, balance);
		
	}
	
	public boolean diposit(double d_amount)
	{
		if(d_amount > 0)
		{
			balance = balance + d_amount;
			return true;
		}
		else
			return false;
	}
	public boolean withdraw(double w_amount)
	{
		if(balance - w_amount >= min_balance)
		{
			balance = balance - w_amount;
			return true;
		}
		else
			return false;
	}
	public void printAccount()
	{
	}
	
}
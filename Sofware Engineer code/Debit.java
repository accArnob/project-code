public class Dedit extends Account 
{
	double max_balance = 1000 - balance;
	double daily_transaction_limit = 50000;
	
	public Dedit()
	{
		
	}
	public Dedit(String name, String nominee, double balance)
	{
		super(name, DOB, nominee, balance);
		
	}
	
	public boolean diposit(double d_amount)
	{
		if(d_amount > 0 && d_amount <= max_balance)
		{
			balance = balance + d_amount;
			return true;
		}
		else
			return false;
	}
	public boolean withdraw(double w_amount)
	{
		if(w_amount <= daily_transaction_limit && w_amount < balance)
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
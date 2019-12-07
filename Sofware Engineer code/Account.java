public class Account{
public class Account{
	
	protected String name;
	//protected String id = IDGen.getID();
	protected String dob;
	protected String nominee;
	protected double balance;
	
	public Account()
	{
		
	}
	
	public Account(String name, String dob, String nominee, double balance)
	{
		
		this.name = name;
		this.dob = dob;
		this.nominee = nominee;
		this.balance = balance;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	/*public String getId()
	{
		return id;
	}*/
	public String getDOB()
	{
		return dob;
	}
	
	public String getNominee()
	{
		return nominee;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public boolean deposit(double d_amount)
	{
		if(d_amount > 0){
			balance = balance + d_amount;
			return true;
		}
		else
			return false;
	}
	
	public boolean withdraw(double w_amount)
	{
		if(w_amount > balance){
			return false;
		}
		else
		{
			balance = balance - w_amount;
			return true;
		}
	}
	
	public void printAccount()
	{
		
		System.out.println("NAME: "+getName());
		//System.out.println("ID: "+getId());
		System.out.println("DATE OF BIRTH: "+getDOB());
		System.out.println("NOMINEE: "+getNominee());
		System.out.println("BALANCE: "+getBalance());
				
	}
}
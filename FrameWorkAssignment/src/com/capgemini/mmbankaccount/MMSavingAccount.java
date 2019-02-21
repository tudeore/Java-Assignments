package com.capgemini.mmbankaccount;

public class MMSavingAccount extends SavingAccount
{

	private boolean isSlary;


	public MMSavingAccount(String accountHolderName, double accounBalance, boolean isSalary)
	{
		super(accountHolderName, accounBalance);
		this.isSlary = isSalary;
	}
	
	
	

	@Override
	public void withDraw(double withdraw)
	{
		if(super.getAccountBalance() > withdraw)
		{
			double accountBalance =  super.getAccountBalance() - withdraw;
		}
	}




	
	
}

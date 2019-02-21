package com.capgemini.mmbankaccount;

public class MMCurrentAccount extends CurrentAccount
{

	public MMCurrentAccount(String accountHolderName, double accounBalance,float creditLimit) 
	{
		super(accountHolderName, accounBalance, creditLimit);
		
	}

	@Override
	public void withDraw(double withdraw)
	{
		if (super.getAccountBalance() >= withdraw)
		{
			 double accountBalance = super.getAccountBalance() - withdraw;
		}
		else if((super.getAccountBalance() + creditLimit) >= withdraw)
		{
			double accounBalance = (super.getAccountBalance() + creditLimit) - withdraw;
		}
		else
		{
			//exception
		}
			
		
	}
	
	
	

}

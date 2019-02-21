package com.capgemini.mmbankaccount;

public abstract class CurrentAccount extends BankAccount
{
	final float creditLimit;

	public CurrentAccount(String accountHolderName, double accounBalance,float creditLimit) //constructor
	{
		super(accountHolderName, accounBalance);
		this.creditLimit = creditLimit;
		
	}
//---------------------withdraw function---------------------------------------------------------------------------------

	@Override
	public abstract void withDraw(double withdraw);				//function
	
}

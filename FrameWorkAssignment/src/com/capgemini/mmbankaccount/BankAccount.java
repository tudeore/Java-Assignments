package com.capgemini.mmbankaccount;

public abstract class BankAccount 
{
	static double accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	static
	{
		accountNumber = 100;
	}
	{
		accountNumber++;
	}
	public BankAccount(String accountHolderName,double accounBalance) 
	{
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
		
	}
	
	public double getAccountNumber() 
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
//-----------withdraw function-----------------------------------------------------------------------------------//
	
	public abstract void withDraw(double withdraw);
	
//---------------Deposit function-----------------------------------------------------------------------------------//
		
	public double deposit(double amount)
	{
		return (this.getAccountBalance() + amount);
	}
	
	
}
package com.capgemini.mmbank;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.mmbankaccount.BankAccount;
import com.capgemini.mmbankaccount.BankFactory;
import com.capgemini.mmbankaccount.CurrentAccount;
import com.capgemini.mmbankaccount.MMBankFactory;
import com.capgemini.mmbankaccount.MMCurrentAccount;
import com.capgemini.mmbankaccount.MMSavingAccount;
import com.capgemini.mmbankaccount.SavingAccount;

public class TestOfBankAccount
{
	
	@Test
	public void test() 
	{
		SavingAccount userOne = new MMSavingAccount("tushar", 15000,true);
		System.out.println(userOne.deposit(10000));
	
	}
	
	@Test
	public void testof() 
	{
		
	}


}

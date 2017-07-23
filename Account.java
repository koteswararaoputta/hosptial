package com.Syncharnization;

public class Account {
	private int balance=50000;
	public int getBalance()
	{
		return balance;
	}
public void withDrow(int amount)
{
	balance=balance-amount;
}
}

package com.Syncharnization;

public class AccountTesting extends Thread{
	private Account acc=new Account();
	
	public static void main(String[] args) {
		AccountTesting at = new AccountTesting();
		Thread one = new Thread(at);  
        Thread two = new Thread(at);  
        one.setName("koti");  
        two.setName("putta");  
        one.start();  
        two.start();  
		
	}
	

public void run()
{
	for (int x = 0; x < 5; x++) {  
        makeWithdrawal(1000);  
        if (acc.getBalance() < 0) {  
            System.out.println("account has no balance!");  
}
}
}
private synchronized void makeWithdrawal(int amt) {
	if(acc.getBalance()<=amt)
	{
		System.out.println(Thread.currentThread().getName() + "is going to withdraw");
				 try {  
		                Thread.sleep(100);  
		            } catch (InterruptedException ex) {  
		            }  
		            acc.withDrow(amt);  
		            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");  
		        } else {  
		            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + acc.getBalance());  
		        }  
		    }  
		  
	
	}

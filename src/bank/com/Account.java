package bank.com;

public class Account {

	//帐户余额
	protected double balance;
	
	public Account(double init_balance) {
		balance = init_balance;
	}
	public double getBalance() {
		return balance;
		
	}
	//存钱
	public boolean deposit(double amt) {
		balance += amt;
		return true;
	}
	//取钱
	public boolean withdraw(double amt) {
		boolean flag = false;
		if(balance >= amt) {
			balance -= amt;
			flag = true;
		}else {
			System.err.println("帐户余额不足");
			
		}
		return flag;
	} 
}

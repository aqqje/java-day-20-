package bank.com;
//储畜帐户
public class SavingAccount extends Account {

	//利率
	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingAccount(double balance, double interest_rate) {
		super(balance);
		this.interestRate = interest_rate;
	}
}

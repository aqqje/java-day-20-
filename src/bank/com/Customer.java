package bank.com;

public class Customer {

	private String firstName;
	private String lastName;
	private SavingAccount savingAcoount;//儲蓄帳戶
	private CheckingAccount checkingAccount;//信用帳戶
	//private Account account;
//	private Account[] accounts;
//	private int numberOfAccounts;//记录Account的个数
	
	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
//		accounts = new Account[5];
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public SavingAccount getSavingAcoount() {
		return savingAcoount;
	}
	public void setSavingAcoount(SavingAccount savingAcoount) {
		this.savingAcoount = savingAcoount;
	}
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
//	public Account[] getAccount() {
//		return accounts;
//	}
//	public void setAccount(Account[] acct) {
//		accounts = acct;
//	}
	//添加一个帐户到Account[]中
//	public void addAccount(Account acct) {
//		accounts[numberOfAccounts] = acct;
//		numberOfAccounts++;
//	}
//	//返回帐户的个数
//	public int getNumOfAccounts() {
//		return numberOfAccounts;
//	}
//	//返回指定索引处的帐户
//	public Account getAccount(int index) {
//		return accounts[index];
//	}

}

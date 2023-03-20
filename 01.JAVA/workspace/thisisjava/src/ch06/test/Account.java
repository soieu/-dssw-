package ch06.test;


public class Account {
	static final int MIN_VALANCE = 0;
	static final int MAX_VALANCE = 1_000_000;

	private String account;
	private String owner;
	private int balance;
	
	public Account(String account, String owner, int balance) {
		this.account = account;
		this.owner = owner;
		this.balance = balance;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getOwner() {
		return owner;
	}
	public void setName(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static int getMinValance() {
		return MIN_VALANCE;
	}
	public static int getMaxValance() {
		return MAX_VALANCE;
	}

	
}

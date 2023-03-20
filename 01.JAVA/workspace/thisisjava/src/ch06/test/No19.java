package ch06.test;

public class No19 {

	public static void main(String[] args) {
		Account account = new Account();
		
		System.out.println("현재 잔고 : "+account.getBalance());
		account.setBalance(10000);
		System.out.println("현재 잔고 : "+account.getBalance());
		account.setBalance(-100);
		System.out.println("현재 잔고 : "+account.getBalance());
		account.setBalance(999999100);
		System.out.println("현재 잔고 : "+account.getBalance());
		account.setBalance(8000);
		System.out.println("현재 잔고 : "+account.getBalance());

	}

}

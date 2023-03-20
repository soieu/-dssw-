package ch06.test;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account[] accounts = new Account [100];
		int accountNum = 0;
		Boolean flag = true;
		
		while(flag) {
			System.out.println("--------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("--------------------------------");
			System.out.print("선택>");
			
			String input = scan.nextLine();
			
			if("1".equals(input))
			{
				System.out.println("-------");
				System.out.println("계좌생성");
				System.out.println("-------");
				
				System.out.print("계좌번호: ");
				String number = scan.nextLine();
				
				System.out.print("계좌주: ");
				String owner = scan.nextLine();
				
				System.out.print("초기입금액: ");
				int price = Integer.parseInt(scan.nextLine());
				
				Account account = new Account(number, owner, price);
				
				account.setAccount(number);
				account.setName(owner);
				account.setBalance(price);
				
				accounts[accountNum++] = account;
				
				System.out.println("결과 : 계좌가 생성되었습니다.");
			}
			else if("2".equals(input))
			{
				System.out.println("-------");
				System.out.println("계좌목록");
				System.out.println("-------");
				for(int i = 0; i<accountNum; i++) {
					System.out.print(accounts[i].getAccount());
					System.out.print("\t");
					System.out.print(accounts[i].getOwner());
					System.out.print("\t");
					System.out.println(accounts[i].getBalance());
				}
			}
			else if("3".equals(input))
			{
				System.out.println("-------");
				System.out.println("예금");
				System.out.println("-------");
				System.out.print("계좌번호: ");
				String s_number = scan.nextLine();
				System.out.print("예금액: ");
				int s_price = Integer.parseInt(scan.nextLine());
				
				for (int i = 0; i < accountNum; i++) {
					if (s_number.equals(accounts[i].getAccount())){
						accounts[i].setBalance(accounts[i].getBalance()+s_price);
						
					}
				}
			}
			else if("4".equals(input))
			{
				System.out.println("-------");
				System.out.println("출금");
				System.out.println("-------");
				System.out.print("계좌번호: ");
				String s_number = scan.nextLine();
				System.out.print("예금액: ");
				int s_price = Integer.parseInt(scan.nextLine());
				
				for (int i = 0; i < accountNum; i++) {
					if (s_number.equals(accounts[i].getAccount())){
						accounts[i].setBalance(accounts[i].getBalance()-s_price);
						
					}
				}
			}
			else if("5".equals(input))
			{
				System.out.println("프로그램 종료");
				flag = false;
			}
			

		}

	}
}
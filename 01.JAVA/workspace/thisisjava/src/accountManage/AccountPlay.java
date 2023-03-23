package accountManage;

import java.util.Scanner;

public class AccountPlay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = null;
		String account_number;
		int account_balance;
		String account_master;
		Account ac = new Account();
		
		
		while(true)
		{
			System.out.println("-------------------------------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("-------------------------------------------");
			System.out.print("����>");
			
			input = scan.nextLine();
			
			if("1".equals(input))
			{
				System.out.println("-----------");
				System.out.println("1.���»���");
				System.out.println("-----------");
				
				System.out.print("���¹�ȣ: ");
				account_number = scan.nextLine();
				
				System.out.print("������: ");
				account_master = scan.nextLine();
				
				System.out.print("�ʱ��Աݾ�: ");
				account_balance = Integer.parseInt(scan.nextLine());
				
				Account new_ac = new Account();
				
				new_ac.setAccount(account_number, account_balance, account_master);
				
				System.out.println("-----------");
			}
			else if("2".equals(input))
			{
				System.out.println("-----------");
				System.out.println("2.���¸��");
				System.out.println("-----------");
				ac.printAccount();
				
			}
			else if("3".equals(input))
			{
				System.out.println("-----------");
				System.out.println("3.����");
				System.out.println("-----------");
				
				System.out.print("���¹�ȣ: ");
				account_number = scan.nextLine();
				
				System.out.print("���ݾ�: ");
				account_balance = Integer.parseInt(scan.nextLine());
				
				ac.plusAccount(account_number, account_balance);
			}
			else if("4".equals(input))
			{
				System.out.println("-----------");
				System.out.println("4.���");
				System.out.println("-----------");
				
				System.out.print("���¹�ȣ: ");
				account_number = scan.nextLine();
				
				System.out.print("��ݾ�: ");
				account_balance = Integer.parseInt(scan.nextLine());
				
				ac.minusAccount(account_number, account_balance);
			}
			else if("5".equals(input))
				break;
		}
	}

}

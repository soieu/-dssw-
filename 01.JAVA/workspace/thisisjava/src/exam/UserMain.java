package exam;
import java.util.Iterator;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = null;
		String id = null;
		String pwd = null;
		String name = null;
		
		System.out.println("1.ȸ����� | 2.ȸ����� | 3.ȸ���� | 4.ȸ������ | 5.����");
		System.out.print("�Է�]");
		input = scan.nextLine();
		
		User user = new User();
		UserTable ut = new UserTable();
		
		while(true) {
			if("1".equals(input)) {
				
				System.out.println("[ȸ�����]");
				System.out.print("���̵�:");
				id = scan.nextLine();
				System.out.print("��й�ȣ:");
				pwd = scan.nextLine();
				System.out.print("�̸�:");
				name = scan.nextLine();
				
				if(ut.insert(id, pwd, name)) {
					System.out.println("ȸ����� ����");
				}
				else
					System.out.println("�ߺ��� ���̵��Դϴ�.");
				}
			else if("2".equals(input)) {
				System.out.println("[ȸ�����]");
				System.out.print("��ȣ\t");
				System.out.print("���̵�\t");
				System.out.print("��й�ȣ\t");
				System.out.println("�̸�");
			}
			else if("3".equals(input)) {
				System.out.println("[ȸ����]");
				System.out.print("���̵�:");
				input = scan.nextLine();
				ut.findUser(input);
			}
			else if("4".equals(input)) {
				System.out.println("[ȸ������]");
				System.out.print("���̵�:");
				id = scan.nextLine();
				System.out.print("��й�ȣ:");
				pwd = scan.nextLine();
				System.out.print("�̸�:");
				name = scan.nextLine();
				if(ut.update(id, name, pwd)) {
					System.out.println("���������� �����Ǿ����ϴ�.");
				}
				else {
					System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
				}
			}
			else if("5".equals(input)) {break;}
				
		}
	}
}

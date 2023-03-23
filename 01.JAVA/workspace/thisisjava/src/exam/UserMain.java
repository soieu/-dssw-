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
		
		System.out.println("1.회원등록 | 2.회원목록 | 3.회원상세 | 4.회원수정 | 5.종료");
		System.out.print("입력]");
		input = scan.nextLine();
		
		User user = new User();
		UserTable ut = new UserTable();
		
		while(true) {
			if("1".equals(input)) {
				
				System.out.println("[회원등록]");
				System.out.print("아이디:");
				id = scan.nextLine();
				System.out.print("비밀번호:");
				pwd = scan.nextLine();
				System.out.print("이름:");
				name = scan.nextLine();
				
				if(ut.insert(id, pwd, name)) {
					System.out.println("회원등록 성공");
				}
				else
					System.out.println("중복된 아이디입니다.");
				}
			else if("2".equals(input)) {
				System.out.println("[회원목록]");
				System.out.print("번호\t");
				System.out.print("아이디\t");
				System.out.print("비밀번호\t");
				System.out.println("이름");
			}
			else if("3".equals(input)) {
				System.out.println("[회원상세]");
				System.out.print("아이디:");
				input = scan.nextLine();
				ut.findUser(input);
			}
			else if("4".equals(input)) {
				System.out.println("[회원수정]");
				System.out.print("아이디:");
				id = scan.nextLine();
				System.out.print("비밀번호:");
				pwd = scan.nextLine();
				System.out.print("이름:");
				name = scan.nextLine();
				if(ut.update(id, name, pwd)) {
					System.out.println("정상적으로 수정되었습니다.");
				}
				else {
					System.out.println("해당 아이디가 존재하지 않습니다.");
				}
			}
			else if("5".equals(input)) {break;}
				
		}
	}
}

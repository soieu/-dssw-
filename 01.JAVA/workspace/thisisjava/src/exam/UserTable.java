package exam;
import java.util.List;
import java.util.Scanner;

public class UserTable {
	List<User> userList;
	private int no; // 자동증가할 번호
	Scanner scan = new Scanner(System.in);
	
	// 생성자(필드 초기화)
	UserTable() {
		no = 1;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	/*
	 * 번호, 아이디, 비밀번호, 이름 입력받아
	 * User객체에 담아 리턴
	 */
	public User getUser(int no, String id, String pwd, String name) {
		User user = new User(no, id, pwd, name);
		userList.add(user);
		return user;
	}
	
	/*
	 * 아이디, 비밀번호, 이름 입력받아
	 * 현재 list에서 아이디가 존재하는지 여부 체크
	 * getUser 메서드를 호출 객체 리턴받아 변수에 저장
	 * 존재하면 false 리턴
	 * 존재하지 않으면 리스트에 추가하고 true 리턴
	 *
	 * 수정 : findUser 메서드 활용
	 * 수정 : no를 1씩 증가되서 저장되도록
	 */
	public boolean insert(String id, String pwd, String name) {
		if(findUser(id) != null) {
			return false;
		}
		User user = new User();
		user.setId(id);
		user.setPwd(pwd);
		user.setName(name);
		user.setNo(no);
		no++;
		userList.add(user);
		return true;
	}
	
	/*
	 * 아이디를 입력받아 리스트에 해당 아이디의 객체 리턴
	 * 존재하지 않으면 null 리턴
	 */
	public User findUser(String id) {
		for(User user : userList) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	/*
	 *  id로 이름,비밀번호 변경
	 */
	public boolean update(String id, String name, String pwd) {
		if(findUser(id) == null) {
			return false;
		}
		User user = findUser(id);
		return true;
	}
}


package exam;
import java.util.List;
import java.util.Scanner;

public class UserTable {
	List<User> userList;
	private int no; // �ڵ������� ��ȣ
	Scanner scan = new Scanner(System.in);
	
	// ������(�ʵ� �ʱ�ȭ)
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
	 * ��ȣ, ���̵�, ��й�ȣ, �̸� �Է¹޾�
	 * User��ü�� ��� ����
	 */
	public User getUser(int no, String id, String pwd, String name) {
		User user = new User(no, id, pwd, name);
		userList.add(user);
		return user;
	}
	
	/*
	 * ���̵�, ��й�ȣ, �̸� �Է¹޾�
	 * ���� list���� ���̵� �����ϴ��� ���� üũ
	 * getUser �޼��带 ȣ�� ��ü ���Ϲ޾� ������ ����
	 * �����ϸ� false ����
	 * �������� ������ ����Ʈ�� �߰��ϰ� true ����
	 *
	 * ���� : findUser �޼��� Ȱ��
	 * ���� : no�� 1�� �����Ǽ� ����ǵ���
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
	 * ���̵� �Է¹޾� ����Ʈ�� �ش� ���̵��� ��ü ����
	 * �������� ������ null ����
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
	 *  id�� �̸�,��й�ȣ ����
	 */
	public boolean update(String id, String name, String pwd) {
		if(findUser(id) == null) {
			return false;
		}
		User user = findUser(id);
		return true;
	}
}


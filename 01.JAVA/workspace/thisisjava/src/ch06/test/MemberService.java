package ch06.test;

public class MemberService {
	//field
	private String id;
	private String password;
	
	//getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//method
	public boolean login(String id, String password) {
		if("hong".equals(id) && "12345".equals(password)) {
			setId(id);
			setPassword(password);
			return true;
		}
		else
			return false;
	}
	
	public void logout(String id) {
		System.out.println(id+"님이 로그아웃 되었습니다.");
	}
	
}

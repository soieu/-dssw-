package ch13;

import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		Object o = new Member();
		Member m = (Member)o;
		
		m.login();
		
		o = new Admin();
		Admin a = (Admin)o;
		
		a.manage();
		
		//o = new Admin();
		
		ArrayList<Member> al = new ArrayList();
		al.add(new Member());
		al.add(new Member());

		for(int i = 0; i < al.size(); i++) {
			Member m2 = (Member)al.get(i);
			System.out.println(m2.login());
		}
	}
}

package ch06;

public class 클래스 {
	private static 클래스 singleton = new 클래스();
	
	private 클래스() {}
	
	public static 클래스 getInstance() {
		return singleton;
	}
}

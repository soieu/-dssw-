package ch11.sec04;

public class MyResource implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("MyResource 닫기");

	}

}

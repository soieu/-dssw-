package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(1);
		rc.turnOff();
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(1);
		rc.turnOff();
	}

}

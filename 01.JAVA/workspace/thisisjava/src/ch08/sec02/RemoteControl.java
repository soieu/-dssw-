package ch08.sec02;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);	
}

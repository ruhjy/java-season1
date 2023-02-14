package ch08.sec04;

public interface RemoteControl {
//	상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

//	추상 메서드 - 구현부가 없음 
//	인터페이스의 추상 메서드는 항상 public abstract
	void turnOn();

	void turnOff();

	void setVolume(int volume);
}

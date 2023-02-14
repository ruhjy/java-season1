package ch08.sec02;

public class Television implements RemoteControl {
	// 추상 메서드 정의 (인터페이스는 추상메서드의 집합)
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

}

package ch08.sec02;

public class Audio implements RemoteControl {
	// 추상 메서드 정의
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

}

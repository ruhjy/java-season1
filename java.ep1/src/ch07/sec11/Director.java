package ch07.sec11;

public class Director extends Manager {
	// 메서드 재정의
	@Override
	public void work() {
		System.out.println("제품을 기획합니다.");
	}
}
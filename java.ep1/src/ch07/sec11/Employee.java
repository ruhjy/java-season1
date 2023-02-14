package ch07.sec11;

public final class Employee extends Person {

	// 메서드 재정의
	@Override
	public void work() {
		System.out.println("제품을 생산합니다.");
	}
}
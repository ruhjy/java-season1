package ch07.sec11;

public non-sealed class Manager extends Person {
	// 메서드 재정의
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
package ch16.sec02.exam01;

public class LambdaExample01 {
	public static void main(String[] args) {

		Person01 person = new Person01();

		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("프로그래밍을 합니다.");
		});
		System.out.println();

		person.action(() -> System.out.println("퇴근을 합니다."));

	}
}

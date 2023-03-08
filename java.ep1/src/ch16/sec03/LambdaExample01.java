package ch16.sec03;

public class LambdaExample01 {
	public static void main(String[] args) {

		Person01 person = new Person01();

		// 매개변수가 두 개일 경우
		person.action1((name, job) -> {
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});

		person.action1((name, job) -> System.out.println(name + "이 "
				+ job + "을 합니다."));

		// 매개변수가 한개일 경우
		person.action2((word) -> {
			System.out.print("\"" + word + "\"");
			System.out.println("라고 말합니다.");
		});

		person.action2(word -> System.out.println("\"" + word + "\"" +
				"라고 말합니다."));
	}
}

package ch16.sec04;

public class LambdaExample01 {
	public static void main(String[] args) {

		Person01 person = new Person01();

		// 실행문이 두 개 이상일 경우
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		person.action((x, y) -> {
			return x + y;
		});

		person.action((x, y) -> x + y);

		person.action((x, y) -> sum(x, y));

	}

	public static double sum(double x, double y) {
		return x + y;
	}
}

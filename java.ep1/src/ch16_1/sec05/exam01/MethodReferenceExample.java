package ch16_1.sec05.exam01;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();

		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		person.action((x, y) -> x + y);
		System.out.println();

		// 정적 메서드일 경우
		// 람다식
		person.action((x, y) -> Computer.staticMethod(x, y));
		// 메서드 참조
		person.action(Computer::staticMethod);
		System.out.println();

		// 인스턴스 메서드일 경우
		Computer com = new Computer();
		// 람다식
		person.action((x, y) -> com.instanceMethod(x, y));
		// 메서드 참조
		person.action(com::instanceMethod);
	}

}

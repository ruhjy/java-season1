package lambda;

public class Ex14_0 {
	public static void main(String[] args) {

		MyFunction2 f = new MyFunction2() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};

		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFunction2 f2 = (a, b) -> a > b ? a : b;

		int value = f2.max(3, 5);
		System.out.println("value : " + value);

	}
}

@FunctionalInterface
interface MyFunction2 {
	public abstract int max(int a, int b);
}

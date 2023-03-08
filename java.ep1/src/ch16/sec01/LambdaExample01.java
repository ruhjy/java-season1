package ch16.sec01;

public class LambdaExample01 {
	public static void main(String[] args) {

		action2((x, y) -> {
			int result = x + y;
			System.out.println("result : " + result);
		});

//		// calculable01.calculate(x, y);
//		action2((x, y) -> {
//			int result = x - y;
//			System.out.println("result : " + result);
//		});

	}

	public static void action(Calculable01 calculable01) {
		// 데이터
		int x = 10;
		int y = 5;
		// 데이터 처리
		calculable01.calculate(x, y);
	}

	public static void action2(Calculable01 a) {
		int x = 20;
		int y = 20;
		System.out.println("start");
		a.calculate(x, y);
		System.out.println("end");

	}
}

package ch16.sec05.exam01;

public class Person01 {
	public void action(Calcuable01 calcuable) {
		double result = calcuable.calc(10, 5);
		System.out.println("결과 : " + result);
	}
}

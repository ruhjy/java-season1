package ch04.sec02;

public class IfElseIfElseExample2 {
	public static void main(String[] args) {

		int input = (int) (Math.random() * 101); // 0 <= input < 101 -> 0~100
		System.out.println("점수는? ----- " + input);

		if (input >= 90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if (input >= 80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		} else if (input >= 70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
	}
}

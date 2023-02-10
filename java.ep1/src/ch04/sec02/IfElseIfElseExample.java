package ch04.sec02;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		System.out.print("점수를 입력해주세요.>>>>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();

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

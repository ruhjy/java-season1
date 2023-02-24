package logintest;

import java.util.Scanner;

public class Index {
	Scanner scan;
	Signup sign = Signup.getInstance();
	Signin login = Signin.getInstance();

	private static Index index = new Index();

	private Index() {
	}

	public static Index getInstance() {
		return index;
	}

	void index() {
		boolean run = true;
		scan = new Scanner(System.in);

		System.out.println("--------------------------");
		System.out.println("1.회원가입|2.로그인|3.종료");
		System.out.println("--------------------------");
		System.out.print("입력>");
		String input = scan.nextLine();

		while (run) {

			switch (input) {
			case "1" -> sign.signUp();
			case "2" -> {
				login.login();
			}
			case "3" -> {
				System.out.println("종료");
				run = false;
			}
			default -> System.out.println("오류");
			}

		}
	}
}

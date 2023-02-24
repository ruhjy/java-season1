package logintest;

import java.util.Scanner;

public class Signin {

	Scanner scan;
	Signup sign = Signup.getInstance();
	Index index = Index.getInstance();

	public static Signin signin = new Signin();

	private Signin() {
	}

	public static Signin getInstance() {
		return signin;
	}

	void login() {

		scan = new Scanner(System.in);

		while (!sign.map.isEmpty()) {

			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = scan.nextLine();
			System.out.println();

			if (sign.map.containsKey(id)) {
				if (sign.map.get(id).equals(pwd)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호 오류. 다시 입력해주세요.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		System.out.println("회원가입해라");
		index.index();
	}

}

package logintest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Signup {
	String id;
	String pwd;
	Scanner scan;
	Index index = Index.getInstance();
	public static Map<String, String> map = new HashMap<>();

	private static Signup join = new Signup();

	private Signup() {
	}

	public static Signup getInstance() {
		return join;
	}

	public void signUp() {
		while (true) {
			signUp1();

			if ((4 <= id.length() && id.length() <= 10) &&
					(4 <= pwd.length() && pwd.length() < 10)) {
				save();
				break;
			} else {
				System.out.println("글자수 확인");
			}
		}
		index.index();
	}

	private void signUp1() {
		scan = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요.4~10");
		id = scan.nextLine();
		System.out.print("비밀번호를 입력해주세요.4~10");
		pwd = scan.nextLine();
	}

	private void save() {
		map.put(id, pwd);
		System.out.println("회원가입 성공");
	}
}

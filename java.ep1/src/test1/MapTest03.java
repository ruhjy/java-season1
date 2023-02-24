package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest03 {
	public static void main(String[] args) {
		Index index = new Index();
		index.index();
	}
}

class Join {
	String id;
	String pwd;
	Scanner scan;
	Index index
	Map<String, String> map = new HashMap<>();;
	private static Join join = new Join();

	private Join() {
	}

	public static Join getInstance() {
		return join;
	}

	public void join() {
		while (true) {
			join1();

			if ((4 <= id.length() && id.length() <= 10) &&
					(4 <= pwd.length() && pwd.length() < 10)) {
				save();
				break;
			} else {
				System.out.println("글자수 확인");
			}
		}
	}

	private void join1() {
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

class LogIn {

	Scanner scan;
	Index index = new Index();
	Join join = Join.getInstance();

	public void login() {

		scan = new Scanner(System.in);

		while (!join.map.isEmpty()) {

			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = scan.nextLine();
			System.out.println();

			if (join.map.containsKey(id)) {
				if (join.map.get(id).equals(pwd)) {
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

class Index {
	Scanner scan;
	Join join = Join.getInstance();
	LogIn login;

	private static Index index = new Index();

	private Index() {
	}

	public Index getInstance() {
		return index;
	}

	void index() {
		scan = new Scanner(System.in);

		System.out.println("--------------------------");
		System.out.println("1.회원가입|2.로그인|3.종료");
		System.out.println("--------------------------");
		System.out.print("입력>");
		String input = scan.nextLine();
		switch (input) {
		case "1" -> join.join();
		case "2" -> {
			login = new LogIn();
			login.login();
		}
		case "3" -> {
			System.out.println("종료");
			break;
		}
		default -> System.out.println("오류");
		}
		;
	}
}
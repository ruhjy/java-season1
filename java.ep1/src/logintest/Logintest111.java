package logintest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Logintest111 {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		while (run) {

			System.out.println("-------------------------------------");
			System.out.println("1.회원가입|2.로그인|3.회원목록|4.종료");
			System.out.println("-------------------------------------");
			System.out.print("입력>");
			String input = scan.nextLine().trim();

			switch (input) {
			case "1" -> {
				singIn(map, scan);
			}
			case "2" -> {
				login(map, scan);
			}
			case "3" -> {
				Set<Entry<String, String>> set = map.entrySet();
				for (Entry<String, String> e : set) {
					System.out.println(e);
				}
			}
			case "4" -> {
				System.out.println("종료");
				run = false;
			}
			default -> System.out.println("오류");
			}
		} // while
	}

	public static void login(Map<String, String> map, Scanner scan) {
		String id;
		String pwd;
		while (!map.isEmpty()) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			id = scan.nextLine();
			System.out.print("비밀번호 : ");
			pwd = scan.nextLine();
			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pwd)) {
					System.out.println("로그인 되었습니다.");
					break;
				} else {
					System.out.println("비밀번호 오류. 다시 입력해주세요.");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
//				System.out.println("회원가입해라");
	}

	public static void singIn(Map<String, String> map, Scanner scan) {
		String id;
		String pwd;
		System.out.println("아이디를 입력해주세요.4~10");
		id = scan.nextLine();
		System.out.println("비밀번호를 입력해주세요.4~10");
		pwd = scan.nextLine();
		if ((4 <= id.length() && id.length() <= 10) && (4 <= pwd.length() && pwd.length() < 10)) {
			if (!map.containsKey(id)) {
				map.put(id, pwd);
				System.out.println("회원가입 성공");
			} else {
				System.out.println("중복 아이디");
			}

		} else {
			System.out.println("글자수 확인");
		}
	}
}

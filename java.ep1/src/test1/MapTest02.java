package test1;

import java.util.Hashtable;
import java.util.Scanner;

public class MapTest02 {
	public static void main(String[] args) {

		Hashtable<String, String> map = new Hashtable<>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 : ");
			String pwd = scan.nextLine();
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
	}
}

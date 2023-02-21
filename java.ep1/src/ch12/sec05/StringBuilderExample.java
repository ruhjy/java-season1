package ch12.sec05;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEF")	// DEF
				.insert(0, "ABC") // index 0에 ABC 삽입 ABCDEF
				.delete(3, 4) // index 3<=data<4; index 3인 D삭제 
				.toString(); // 문자열 리턴
		
		System.out.println(data); // ABCEF
	}
}

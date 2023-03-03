package ch13_1.sec01;

public class GenericExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
//		String string = box1.content = "안녕하세요.";
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);
		System.out.println();

		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);

	}
}

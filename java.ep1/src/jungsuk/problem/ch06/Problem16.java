package jungsuk.problem.ch06;

public class Problem16 {

	public static String change(String str) {
		return str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change : " + str);
	}
}
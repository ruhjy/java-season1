package jungsuk.ch09;

import java.util.Arrays;

public class Ex9_8 {
	public static void main(String[] args) {

		char[] cArr = new char[0]; // char[] cArr = {};
		String s = new String(cArr); // String s = new String("");

		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");

		String s1 = "Hellollo";
		String s2 = s1.replace("ll", "LL");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println();

		String s3 = "Hellollo";
		String s4 = s1.replaceAll("ll", "LL");
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);

		String animals = "dog,cat,bear,fox,tiger,horse";
//		String[] arr = animals.split(",");
		String[] arr = animals.split(",", 3);
		System.out.println(Arrays.toString(arr));
		System.out.println("arr.length : " + arr.length);
	}
}

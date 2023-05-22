package test1;

import java.net.http.*;

public class TTest1 {
	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		boolean res1 = a == b;
		System.out.println(res1);
		System.out.println();
		String str1 = "a";
		String str2 = "b";
		boolean res2 = str1 == str2;
		System.out.println(res2);
		
		Integer a1 = 1;
		Integer a2 = 1;
		
		boolean res3 = a1 == a2;
		System.out.println(res3);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		

	}
}

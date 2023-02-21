package jungsuk.ch09;

public class Ex9_10 {
	public static void main(String[] args) {

		int i = 100;
		String str1 = i + "";
		String str2 = String.valueOf(i);

		System.out.printf("%s, %s%n", str1, str2);

		int i2 = Integer.parseInt("100");
		int i3 = Integer.valueOf("100");
		System.out.printf("%d, %d%n", i2, i3);

		int iVal = 100;
		String strVal = String.valueOf(iVal);

		double dVal = 200.0;
		String strVal2 = dVal + "";

		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);

		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

		System.out.println(String.join("", strVal, " + ", strVal2, " = ") + sum);
		System.out.println(strVal + " + " + strVal2 + " = " + sum2);
		
		int val1 = Integer.parseInt(" 123 ".trim());
		System.out.println(val1);
		int val2 = Integer.valueOf(" 123 ".trim());
//		int val2 = Integer.valueOf(" 123 ");
		System.out.println(val2);

	}
}

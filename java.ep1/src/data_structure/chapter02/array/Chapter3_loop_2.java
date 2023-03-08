package data_structure.chapter02.array;

import java.util.*;

public class Chapter3_loop_2 {
	public static void main(String[] args) {

		int[] students = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("변경 전 : " + Arrays.toString(students));

		int[] students2 = new int[students.length];
		for (int i = 0; i < students2.length; i++) {
			students2[(students2.length - 1) - i] = students[i];
		}
		System.out.println("변경 후 : " + Arrays.toString(students2));
	}
}

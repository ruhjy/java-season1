package data_structure.chapter02.array;

public class Chapter3_multiArray {
	public static void main(String[] args) {

		int[][] arr = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};

		int[][] arr2 = new int[2][3];

		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;

		System.out.println("arr의 크기: " + arr.length);
		System.out.println("arr2의 크기: " + arr2.length);

	}
}

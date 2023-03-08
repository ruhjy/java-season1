package data_structure.chapter02.array;

public class Chapter3_multiArrayExample2 {
	public static void main(String[] args) {
		int[][] arr = new int[8][9];

		for (int i = 0, k = 2; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k * (j + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j != 0 && j % 3 == 0) {
					System.out.println("");
				}

				System.out.print((i + 2) + "x" + (j + 1) + "=" + arr[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}
}

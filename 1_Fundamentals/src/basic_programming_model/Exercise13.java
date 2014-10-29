package basic_programming_model;

import java.util.Scanner;

public class Exercise13 {
	private static void printMatrix(int[][] arr) {
		if (arr == null) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j != arr[i].length - 1) {
					System.out.printf("%d ", arr[i][j]);
				} else {
					System.out.printf("%d\n", arr[i][j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			final int m = cin.nextInt();
			final int n = cin.nextInt();

			int[][] oriArr = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					oriArr[i][j] = cin.nextInt();
				}
			}

			printMatrix(oriArr);

			int[][] trsArr = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					trsArr[i][j] = oriArr[j][i];
				}
			}

			printMatrix(trsArr);
		}

		cin.close();
	}
}

package basic_programming_model;

import java.util.Scanner;

public class Exercise15 {
	public static int[] histogram(int[] a, int m) {
		for (int i = 0; i < m; i++) {
			a[i] *= m;
		}

		for (int i = 0; i < m; i++) {
			a[a[i] / m] += 1;
		}

		return a;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int m = cin.nextInt();
			int[] a = new int[m];
			
			for (int i = 0; i < m; i ++) {
				a[i] = cin.nextInt();
			}
			
			int[] b = histogram(a, m);
			
			for (int i = 0; i < m; i ++) {
				System.out.println(i + " 出现的次数为：" + b[i] % m);
			}
		}

		cin.close();
	}
}

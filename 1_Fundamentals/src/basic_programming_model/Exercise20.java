package basic_programming_model;

import java.util.Scanner;

public class Exercise20 {
	private static double calLn(int n) {
		if (n <= 1) {
			return 0;
		}

		return calLn(n - 1) + Math.log(n);
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();

			System.out.println(calLn(n));
			// Test for 5!
			System.out.println(Math.log(120));
		}

		cin.close();
	}
}

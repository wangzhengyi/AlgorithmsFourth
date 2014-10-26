package basic_programming_model;

import java.util.Scanner;

public class Exercise9 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			int n = cin.nextInt();

			if (n < 0) {
				System.out.println("continue");
				continue;
			}

			String res = "";
			while (n > 0) {
				res = (n % 2) + res;
				n /= 2;
			}
			System.out.println(res);
		}

		cin.close();
	}
}

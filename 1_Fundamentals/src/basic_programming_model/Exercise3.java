package basic_programming_model;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner cin = new Scanner(System.in);
		
		while (cin.hasNext()) {
			a = cin.nextInt();
			b = cin.nextInt();
			c = cin.nextInt();

			if (a == b && b == c) {
				System.out.println("equal");
			} else {
				System.out.println("not equal");
			}
		}
		
		cin.close();
	}
}

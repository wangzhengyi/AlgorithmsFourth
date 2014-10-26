package basic_programming_model;

import java.util.Scanner;

public class Exercise5 {
	private static boolean isLimitOneDoubleVariable(double var) {
		if (var >= 0 && var <= 1) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			double x = cin.nextDouble();
			double y = cin.nextDouble();

			if (isLimitOneDoubleVariable(x) && isLimitOneDoubleVariable(y)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
		
		cin.close();
	}
}

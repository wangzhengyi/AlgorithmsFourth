package basic_programming_model;

public class Exercise16 {
	public static String exR1(int n) {
		if (n <= 0) {
			return "";
		}
		
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}
	
	public static void main(String[] args) {
		final int n = 6;
		
		System.out.println(exR1(n));
	}
}

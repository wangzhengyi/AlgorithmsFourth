package basic_programming_model;

public class Exercise19 {
	public static long F(int N) {
		if (N == 0) {
			return 0;
		}
		
		if (N == 1) {
			return 1;
		}
		
		long a = 0, b = 1, c = 0;
		for (int i = 2; i <= N; i ++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}
	
	public static long F1(int N) {
		if (N == 0) {
			return 0;
		}
		
		if (N == 1) {
			return 1;
		}
		
		return F(N - 1) + F(N - 2);
	}
	
	
	public static void main(String[] args) {
		for (int N = 0; N < 100; N ++) {
			System.out.println(N + " " + F(N));
		}
	}
}

package basic_programming_model;

public class Exercise11 {
	public static void main(String[] args) {
		boolean[][] initArray = { { true, true, false },
				{ true, false, false }, { true, true, true } };

		for (int i = 0; i < initArray.length; i++) {
			for (int j = 0; j < initArray[i].length; j++) {
				if (initArray[i][j]) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}

				if (j == initArray[i].length - 1) {
					System.out.printf("\n");
				}
			}
		}
	}
}

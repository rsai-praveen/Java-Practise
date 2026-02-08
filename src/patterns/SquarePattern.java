package patterns;

public class SquarePattern {

	public static void pattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("@ \t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		pattern(5);
	}

}

package arraycollection;

public class MultidimentionArray {
	public static void main(String[] args) {

		Object array1[][] = { { 1, 2, 3 }, { "Avinash", "Vitthal", "Karche" }, { 10, 11, 12 }, { 90, 80, 70 },{ 10, 20, 30 } };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();

		}

		// Using For Each Loop iteration

		for (Object iteratedArray[] : array1) {
			for (Object a : iteratedArray) {
				System.out.print(a + " ");
			}
			System.out.println();

		}

	}

}

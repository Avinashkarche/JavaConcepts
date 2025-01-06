package loops;

public class DoWhileLoop {
	public static void main(String[] args) {
//		syntax:
//		do
//		{
//			Actions
//		}
//		while(boolean_condition);
//
		int j = 5;

		do {
			System.out.println("Wednesday");
			j++;
		} while (j < 10);

		for (

				int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;

			}
			System.out.println(i);
		}
	}
}

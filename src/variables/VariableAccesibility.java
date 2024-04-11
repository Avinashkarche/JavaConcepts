package variables;


public class VariableAccesibility {
	int i = 10;

	static int j = 50;

	public static void main(String[] args) {
		int i = 20;

		int j = 70;

		System.out.println(i);// 20

		System.out.println(j);// 70

		System.out.println(VariableAccesibility.j);// 50

		VariableAccesibility t = new VariableAccesibility();

		System.out.println(t.i);// 10

	}


}

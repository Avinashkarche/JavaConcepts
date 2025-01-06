package variables;

public class NonStaticVariableOrGlobal {
	String s = "pune";

	public static void main(String[] args) {

		NonStaticVariableOrGlobal nsv1 = new NonStaticVariableOrGlobal();

		System.out.println(nsv1.s);// Pune

		nsv1.s = "Mumbai";

		System.out.println(nsv1.s);// Mumbai

		NonStaticVariableOrGlobal nsv2 = new NonStaticVariableOrGlobal();

		System.out.println(nsv2.s);// Pune

		System.out.println(nsv1.s);// Mumbai

		NonStaticVariableOrGlobal nsv3 = new NonStaticVariableOrGlobal();

		nsv2.s = "Bangalore";

		System.out.println(nsv3.s);

	}
}

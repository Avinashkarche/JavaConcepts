package constructorsInJava;

public class ZeroArgumentConstructor {

	// declaration
	static int a;
	static String name;

	// constructor
	public ZeroArgumentConstructor() {

		// initiation
		a = 20;
		name = "Ganesh";

		// usage

		System.out.println(a);
		System.out.println(name);

	}

	public static void main(String args[])

	{

		ZeroArgumentConstructor xvz = new ZeroArgumentConstructor();

		// System.out.println(xvz.a+" "+xvz.name);
	}
}

package wrapperclassandcasting;

public class ImplicitCasting {

	// It is a casting in which lower order data type gets converted into higher
	// order data type.
	// There is no chance of data loss.
	public static void main(String[] args) {
		byte b = 20;

		int c = b;

		System.out.println(c);// 20

		short s = 90;

		long l = s;

		System.out.println(l);// 90

	}

}

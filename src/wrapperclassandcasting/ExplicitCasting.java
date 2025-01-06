package wrapperclassandcasting;

public class ExplicitCasting {
	// explicit casting: It is a casting in which higher order data type gets
	// converted into lower order data type.
	// In this we have a chance of getting data loss.

//			Explicit casting

	public static void main(String[] args) {

		int i = 129;

		byte t = (byte) i;

		System.out.println(t);

	}
}
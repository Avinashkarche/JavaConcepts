package wrapperclassandcasting;

public class WrapperClassConcept {
	public static void main(String[] args) {

		// Conversion of Primitive data type into non primitive:

		int s35 = 40;

		String s36 = String.valueOf(s35);

		System.out.println(s36 + 5);// 405

		boolean s37 = true;

		String s38 = String.valueOf(s37);

		System.out.println(s38);// true

		// Conversion of non - Primitive data type into primitive
		
		String s31 = "10";

		int s32 = Integer.parseInt(s31);// 10

		System.out.println(s32);

		String s33 = "58.56";

		double s34 = Double.parseDouble(s33);

		System.out.println(s34);// 58.56

	}

}
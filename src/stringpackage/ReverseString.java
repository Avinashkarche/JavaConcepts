package stringpackage;

public class ReverseString {
	public static void main(String[] args) {

		String Name = "My Name Is Avinash Karche";
		String reversed = "";

		for (int i = Name.length() - 1; i >= 0; i--) {
			reversed += Name.charAt(i);
		}

		System.out.println(reversed);
	}

}

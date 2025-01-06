package stringpackage;

public class CheckPalindromeString {
	
	public static void main(String[] args) {

		String Name = "My Name Is Avinash Karche";
		String reversed = "";

		for (int i = Name.length() - 1; i >= 0; i--) {
			reversed += Name.charAt(i);
		}

		if (Name.equals(reversed)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}

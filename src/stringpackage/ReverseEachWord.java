package stringpackage;

public class ReverseEachWord {
	public static void main(String[] args) {
		String s = "Avinash Vitthal Karche"; // Original String
		
		String[] words = s.split(" "); // splitting String into words
		
		String reversestring = ""; // for storing reverse main string
		
		for (String w : words) // Avinash
		{
			String reverseword = ""; // For storing reverse word
			for (int i = w.length() - 1; i >= 0; i--) {
			   reverseword += w.charAt(i); // hsanivA lahttiV ehcraK
			}
			reversestring = reversestring + reverseword + " ";
		}
		System.out.println(reversestring);
	}

}  
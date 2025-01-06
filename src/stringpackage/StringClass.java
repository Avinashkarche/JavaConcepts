package stringpackage;

public class StringClass {
	public static void main(String[] args) {

		String name = "Avinash";
		String lastName = "Avi";
		String middleName = "";
		String nameWithSpace="Avinash Vitthal Karche";
		String withSpace="                  Avinash Vitthal Karche              ";

		String s = new String("avinash");
		String s1 = new String("Avinash");

		System.out.println(name == s);// false
		System.out.println(name == lastName);// true
		System.out.println(name.equals(s1));// true
		System.out.println(name.equalsIgnoreCase(s));

    	System.out.println(name.indexOf('a')); // provide the index of character
		System.out.println(name.lastIndexOf('a')); // provide the last index of character

		char charValue = name.charAt(6);
		System.out.println(charValue);

		boolean endValue = name.endsWith("sh");
		System.out.println(endValue);

		String concatination = name.concat(lastName);
		System.out.println(concatination);

		boolean equalsMethod = name.equals(lastName);
		System.out.println(equalsMethod);

		boolean blankMethod = middleName.isBlank();
		System.out.println(blankMethod);

		boolean emptyMethod = middleName.isEmpty();
		System.out.println(emptyMethod);

		char emptyMethod1[] = lastName.toCharArray();
		System.out.println(emptyMethod1);

		String em = middleName.toString();
		System.out.println(em);

		System.out.println(name == s);
		System.out.println(name == lastName);
		System.out.println(name.equals(s1));
		
		String afterSplited[] = nameWithSpace.split(" ");
		for(String splited:afterSplited)
		{
			System.out.println(splited); 
		}
		
		System.out.println(withSpace .trim());      //It remove Spaces only start and Last 
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.contains("a"));    //for matching world or sentence it gives boolean value
		}
	

}
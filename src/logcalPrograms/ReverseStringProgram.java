package logcalPrograms;

public class ReverseStringProgram {
	public static void main(String[] args) {

		String str = "AVINASH";

		String rev = "";

//		for (int i = str.length() - 1; i >=0; i--) {
//
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);

//		StringBuffer sb =new StringBuffer(str);
//		System.out.println(sb.reverse());
		
		char a[]=str.toCharArray();
		
		for (int i = str.length() - 1; i >=0; i--) {
			rev=rev+a[i];
			
		}
		System.out.println(rev);
		}
		
	}
	



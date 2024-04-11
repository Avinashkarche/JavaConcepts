
package variables;

public class DefaultValues {
//	If we don’t assign any value to a class level variable (Global variable) then automatically jvm -
//	will assign a default values to those variable which is called as default value.
//	Int default value  = 0
//	Double = 0.0
//	Float = 0.0
//	Boolean = false
//	Char = <space>
//	String = null
    static int i;
	
	static String s;
	
	static double d;
	
	public static void main(String[] args) {
		
		int j = 5;
		
		System.out.println(i);//0
		
		System.out.println(s);//null
		
		System.out.println(d);//0.0
		
		System.out.println(j);
	}


}

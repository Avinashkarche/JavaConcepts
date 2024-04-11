package constructorsInJava;

public class ParameterizedConstructor {
	String studentname;
	static String collegename = "coep";
	double percentage;
	int age; 
	static String collegecity = "Pune";
	
	
	
	public ParameterizedConstructor(String sname, double pcent, int age )
	{
		studentname = sname;
		percentage = pcent;
		this.age = age;
		
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor s1 = new ParameterizedConstructor("Eder", 40, 12);
		 
		ParameterizedConstructor s2 = new ParameterizedConstructor("Ron", 80, 13);
		 
		ParameterizedConstructor s3 = new ParameterizedConstructor("Diana", 60, 14);
		 
		 System.out.println(s2.studentname);
		 

}
}
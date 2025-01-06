package constructorsInJava;

public class ParameterizedConstructor {

	String name;
	int age;
	double percentage;
	String grade;
	
	 
	public ParameterizedConstructor(String name, int age,double percentage, String studentgrade)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		grade=studentgrade;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ParameterizedConstructor p = new ParameterizedConstructor("Avinash",26,85.20,"A+");
		System.out.println(p.name+"  " + p.age+" "+p.percentage+" "+p.grade);
		
		
		
		
	}

}
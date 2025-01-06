package constructorsInJava;

public class DefaultConstructor {
	String name;
	int age;
	
	
	public static void main(String[] args) {
		
		DefaultConstructor d=new DefaultConstructor() ;
		System.out.println(d.name);
		System.out.println(d.age);
		
	}
	

}

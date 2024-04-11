package Methods;

public class StaticMethod {
	public static void m1()
	{
		System.out.println("M1 method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		m1();
		
		StaticMethod.m1();
}

}

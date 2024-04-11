package methodOverridingAndOverloading;

public class MethodOverloading {
	public void m1()
	{
		System.out.println("m1 method with no argument");
		
	}
	
	
	public void m1(int i)
	{
		System.out.println("m1 method with int argument");
		
	}

	
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		
		m.m1();
		
		m.m1(10);
		
	}

}

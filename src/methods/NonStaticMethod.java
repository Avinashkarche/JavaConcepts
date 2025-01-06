package methods;

public class NonStaticMethod {
	public void m2()
	{
		System.out.println("non static m2 method");
	}

public static void main(String[] args) {
		
	NonStaticMethod t = new NonStaticMethod();
		
		t.m2();
		
	}

}

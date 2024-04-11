package methodOverridingAndOverloading;

public class MethodOverriding1 extends MethodOverriding {
	public void m1()
	{
		System.out.println("m1 method from MethodOverriding1 class");
	
	}

	
	public void m2()
	{
		System.out.println("non static m2 method from MethodOverriding1 class");
	}
	
	
	public static void main(String[] args) {
		
		MethodOverriding1 b = new MethodOverriding1();
		
		b.m1();// MethodOverriding1 class m1 method 
		
		b.m2();// MethodOverriding1 class m2 method
		
		MethodOverriding1 a =  new MethodOverriding1();
		
		a.m1();// MethodOverriding class m1 method
		
		a.m2();  // MethodOverriding class m2 method
		
		
//		Parent_classname reference_variable = new ChildClassName();
		
		MethodOverriding aa = new MethodOverriding1();
		
		aa.m1();// MethodOverriding1 class m1 method
		
		aa.m3();// MethodOverriding class m3 method


}
}
package variables;

public class StaticVariable {
           static int a = 50;
	
	
	public static void main(String[] args) {
		
		System.out.println(a);//if static variable is inside the same class
		
		System.out.println(StaticVariable.a);//if static variable in any class
		
		
		StaticVariable sv = new StaticVariable();// It is Not recommendable in Static variable
		
		System.out.println(sv.a);
		
	}
}

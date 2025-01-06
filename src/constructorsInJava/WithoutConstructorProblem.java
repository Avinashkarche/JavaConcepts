package constructorsInJava;

public class WithoutConstructorProblem {
	String name;
	int age;
	
	public static void main(String[] args) {
		//First way to giving its value with object ref variable
		WithoutConstructorProblem w = new WithoutConstructorProblem();
		w.name="Avinash";      // This two lines increased every times 
		w.age=26;
		
		WithoutConstructorProblem w1 = new WithoutConstructorProblem();
		w1.name="Avi";          // This two lines increased every times 
		w1.age=27;
		
		WithoutConstructorProblem w2 = new WithoutConstructorProblem();
		w2.name="Aviraj";       // This two lines increased every times 
		w2.age=28;
		
		System.out.println(w.name+" "+w.age );
		System.out.println(w1.name+" "+w1.age );
		System.out.println(w2.name+" "+w2.age );
	
	}
	
	//Second way with object reference variable 
//	public static void main(String[] args) {
//		WithoutConstructorProblem w = new WithoutConstructorProblem();
//		System.out.println(w.name);   //it initiate the null and 0 value in every different object
//		System.out.println(w.age);
//		
//		
//		WithoutConstructorProblem w1 = new WithoutConstructorProblem();
//		System.out.println(w1.name);   //it initiate the null and 0 value in every different object
//		System.out.println(w1.age);
//		
//	}

}

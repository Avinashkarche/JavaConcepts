package Methods;
// Four Categories of Main Method
//1. Method with no return and no argument
//2. Method with no return and with argument
//3. Method with return and no argument
//4. Method with return and with argument


public class MainMethod {
	//no return and no argument
		public static void m1()
		{
			System.out.println("method with no return and no argument");
		}
		
//		no return and with argument
		
		public static void m2(int i)
		{
			System.out.println("method with no return and with  argument");
			
			System.out.println("i value is "+i);
		}
		
		
		
//		with return and no argument
		
		public static String m3()
		{
			String s = "city";
			
			System.out.println("This is with return and no argument");
				
			return "Pune"+s;
					
		}

}
//It is a method whose syntax or name is already configured inside jvm 
//on that basis it will be able to access the main method and execute the same.

package variables;

public class ThisKeyword {
	
     int i = 50;
	
	 static int j = 100;
	
	public void m1()
	{
	int i = 60;
	
	System.out.println(this.i);
	
	System.out.println(j);
	System.out.println(i);
		
	}
	
		public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		
		tk.m1();
	}

}
//It is a keyword in java which is used to access the global variable (static and non static )
	//inside the non-static area (non static method, constructor).

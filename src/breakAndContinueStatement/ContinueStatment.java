package breakAndContinueStatement;
//It is a keyword which move the control of the program to the next iteration once it executes 
//and will not allow the code written below to get execute
public class ContinueStatment {
public static void main(String[] args) {
		
		for(int i=1; i<10; i++)
		{
			
			
			if(i%2==0)
			{
				continue;
			}
			
			System.out.println(i);
			
			
		}

}
}
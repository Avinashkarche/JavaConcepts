package breakandcontinuestatement;
//It is a keyword which is used to break the current loop 
//and make the control of the program out of the loop
public class BreakStatment {
public static void main(String[] args) {
		
		int i = 10;
		while(i<=50)
		{
			System.out.println("Hello");
			
			if(i==20)
			{
				break;
			}
			i++;
		}
		

}
}

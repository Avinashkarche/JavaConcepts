package encapsulationconcept;

public class DataHidingUsingEncapsulation {

	private int balance = 500;

	public void getbalance(int pin) {
		
		if(pin==1234)
		{
			System.out.println("Successfully fetched Balance  "+ balance);
		}
		else 
		{
			System.out.println("wrong pin");
		}
	}

}

package methodoverridingandoverloading;

public class MainClass {
	public static void main(String[] args) {
		
		FlighBooking f = new BusinessClass();
		f.ticketBooking();
	
		
		FlighBooking f1 = new EconomyClass();
		f1.ticketBooking();
		
		FlighBooking f3 = new FlighBooking();
		f3.ticketBooking();;
		
		
	}

}

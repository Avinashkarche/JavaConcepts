package abstractionandinterface;

public class Class2 extends Class1 {

	public void m4() {

		System.out.println("m4 method completed by Class2 class");
	}

	public void m5() {

		System.out.println("m5 method completed by Class2 class");
	}

	public void m6() {

		System.out.println("m6 method completed by Class2 class");

	}

	public static void main(String[] args) {
		Class2 t2 = new Class2();

		t2.m1();

		t2.m4();

		Class1 t = new Class2();

		t.m1();

		t.m4();

	}

}
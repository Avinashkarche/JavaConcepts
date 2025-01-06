package abstractionandinterface;

public class Test implements InterFace2 {

	public void m1() {

		System.out.println("M1 method ");

	}

	public void m2() {
		System.out.println("M2 method ");

	}

	public void m3() {
		System.out.println("M3 method ");

	}

	public void m4() {
		System.out.println("M4 method ");

	}

	public static void main(String[] args) {
		Test t = new Test();

		t.m1();

		t.m2();

		t.m3();

		t.m4();

	}
}
package encapsulationconcept;

public class EncapsulationConcept {

	private String Name;
	private int age;

	public String getName() {

		return Name;

	}

	public void setName(String uname) {

		Name = uname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		EncapsulationConcept ref = new EncapsulationConcept();
		ref.setName("Avinash");
		System.out.println(ref.getName());
		ref.setAge(25);
		System.out.println(ref.getAge());

	}
}

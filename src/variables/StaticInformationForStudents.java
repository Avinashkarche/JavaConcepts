package variables;

public class StaticInformationForStudents {
	//WAP to store the following information for 4 student:
	
//	Studentname- String non static variable
//	Collegename – String static variable
//	Percentage – double non static 
//	Age – int – non static
//	Solution:

		String studentname;
		static String collegename;
		double percentage;
		int age; 
		static String collegecity;
		public static void main(String[] args)
		{
			collegename = "coep";
			
			collegecity = "pune";
			
			StaticInformationForStudents student1 = new StaticInformationForStudents();
			
			student1.studentname = "Eder";
			
			student1.percentage = 50.56;
			
			student1.age = 12;
			
			
			StaticInformationForStudents student2 = new StaticInformationForStudents();
			
			student2.studentname = "Daniel";
			
			student2.percentage = 70;
			
			student2.age = 13;
			
			StaticInformationForStudents student3 = new StaticInformationForStudents();
			
			student3.studentname = "Diana";
			
			student3.percentage = 60;
			
			student3.age = 13;
			
			StaticInformationForStudents student4 = new StaticInformationForStudents();
			
			student4.studentname = "Ron";
			
			student4.percentage = 80;
			
			student4.age = 12;
			
			
			
			System.out.println(student3.percentage);
			System.out.println(student1.percentage);
			
			
			
		}

}

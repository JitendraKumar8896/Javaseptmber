package constructor;

public class StudentDepartment {

	public static void main(String[] args) {
		
		 Student s1 = new Student(122,"JItendra");
		 Student s2 = new Student(123,"Vijendra");
		 Student s3 = new Student(124,"Amit");
		
		Department d1 = new Department(11 , "CS" ,s1);
		Department d2 = new Department(12,"CE", s2);
		Department d3 = new Department(13,"ES",s3);
	
	    System.out.println("=================================");
	    System.out.println("Id  Stream  Roll Number  Name");
	    System.out.println("=================================\n");
	    System.out.println(d1);
	    System.out.println("----------------------------------");
	    System.out.println(d2);
	    System.out.println("----------------------------------");
	    System.out.println(d3);
	    System.out.println("----------------------------------");
	}

}

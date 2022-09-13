package constructor;

public class Student {
   int roll;
   String name;
   
   public Student(int roll, String name)
   {
	   this.roll = roll;
	   this.name = name;
	  
   }
   public String toString()
   {
	   return roll +" "+ name;
   }
}

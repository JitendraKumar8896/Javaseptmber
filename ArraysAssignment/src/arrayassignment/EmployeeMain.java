package arrayassignment;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of Arrays:");
        int size = sc.nextInt();
        Employee emp[] = new Employee[size];
       
        for(int i=0;i<size;i++)
        {
        	 System.out.println("Enter the Id , Name,Dept,Salary:");
        	int id = sc.nextInt();
        	String name = sc.next();
        	String dept = sc.next();
        	int salary = sc.nextInt();
        	Employee e = new Employee();
            e.setId(id);
            e.setName(name);
            e.setDept(dept);
            e.setSalary(salary);
            emp[i] = e;
        }
        System.out.println("Results Is Here..");
        for(Employee ee :emp)
        {
     	      	   
     	   if(ee.salary>=60000)
     	   {
     		   System.out.println(ee.getName()+ " "+ee.getSalary());
     	   }
        }
        
	}

}

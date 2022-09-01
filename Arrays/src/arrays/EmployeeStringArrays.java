package arrays;

import java.util.Scanner;

public class EmployeeStringArrays {
	int id,salary;
	String name,dept;
	
	
    public EmployeeStringArrays(int id,String name,String dept,int salary) 
    {
    	this.id =id;
    	this.name= name;
    	this.dept = dept;
    	this.salary = salary;
    }
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of Arrays:");
        int size = sc.nextInt();
        EmployeeStringArrays emp[] = new EmployeeStringArrays[size];
        System.out.println("Enter the Id , Name,Dept,Salary:");
        for(int i=0;i<size;i++)
        {
        	
        	int id = sc.nextInt();
        	String name = sc.next();
        	String dept = sc.next();
        	int salary = sc.nextInt();
        	emp[i] = new EmployeeStringArrays(id,name,dept,salary);
        }
           for(EmployeeStringArrays e :emp)
           {
        	  // System.out.println(e);
        	   if(e.dept.equals("hr"))
        	   {
        		   System.out.println(e);
        	   }
        	   if(e.salary>60000)
        	   {
        		   System.out.println(e.name+" "+e.salary);
        	   }
           }
        
	}

}

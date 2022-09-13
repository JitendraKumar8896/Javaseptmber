package constructor;

import java.util.Scanner;

public class StaticMethod {
	int  id,salary;
	String name;
	static String compName = "TCS";
	
	static {
		compName = "Wipro";
		System.out.println("Static Block 1");
	}
	static{
		System.out.println("Static Block 2");
	}
	
	static void companyInfo()
	{
		System.out.println("Good Company.. One of the top most company..");	
		System.out.println(compName);
		//StaticMethod sc = new StaticMethod( compName);
		//System.out.println(sc.salary);
	}
	StaticMethod(int id, int salary,String name)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
    public String toString()
    {
    
	return id +" "+name+" "+salary ;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:");
        int id = sc.nextInt();
        System.out.print("Enter Name:");
        String name = sc.next();
        System.out.println("Enter salary:");
        int salary = sc.nextInt();
        
        StaticMethod st = new StaticMethod(id, salary, name);
        System.out.println(StaticMethod.compName);
        System.out.println(st.id +"\n"+st.name);
	}

}

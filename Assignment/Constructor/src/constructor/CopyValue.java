package constructor;

import java.util.Scanner;

public class CopyValue {
         int id;
         String name;
         long contect;
	 CopyValue(int id, String name,long contect){
         
         this.id = id;
         this.name = name;
         this.contect = contect;
    }

     //Copy value of one object into another.
     CopyValue(CopyValue obj){
        
         this.id = obj.id;
         this.name = obj.name;
         this.contect = obj.contect;
     }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter contect:");
		long contect = sc.nextLong();
		
		 CopyValue obj1 = new CopyValue(id,name,contect);
		 System.out.println("-----------------------------------");
		 System.out.println("Obj1 id = " + obj1.id);
         System.out.println( "Obj1 name = " + obj1.name);
         System.out.println("Obj1 contect = "+obj1.contect); 
         System.out.println("\n-----------------------------------");
         CopyValue obj2 = new CopyValue(obj1);
         System.out.println("Obj2 id = " + obj2.id);
         System.out.println( "Obj2 name = " + obj2.name);
         System.out.println("Obj2 contect = "+obj2.contect); 
         System.out.println("\n-----------------------------------");
	}

}

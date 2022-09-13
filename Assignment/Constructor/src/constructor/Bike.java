package constructor;

import java.util.Scanner;

public class Bike {
	int id,engine,price,discountPrice;
	String name,brand,color,pay;
	Bike(int id,int engine, int price,String name,String  brand,String color,String pay)
	{
		this.id = id;
		this.name = name;
		this.engine = engine;
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.pay = pay;
	}
	 public String toString()
	 {
		 return "Id="+id+"\nBike name="+name +"\nBrand="+brand+"\nEngine="+engine+"\nColor="+color+"\nPrice="+price+"\nPaymentMode Type="+pay;
	 }
	
	 void discount()
	 {
		 if(pay.equals("online"))
           {
	         int  discountedPrice = price-price/100*10; 
	         System.out.println("Discounted Prise Is:"+ discountedPrice);
            }
		 else if(pay.equals("cash"))
         {
	         int  discountedPrice = price-price/100*20; 
	         System.out.println("Discounted Prise Is:"+ discountedPrice);
          }
		 
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,engine,price;
		String name,brand,color,pay;
		System.out.print("Enter id:");
		id = sc.nextInt();
		System.out.print("Enter Bike Name:");
		name = sc.next();
		System.out.print("Enter Brand Name:");
		brand = sc.next();
		System.out.print("Enter Engine capacity:");
	    engine = sc.nextInt();
	    System.out.print("Enter color :");
        color = sc.next();
        System.out.print("Enter Price:  ");
        price = sc.nextInt();
        System.out.print("Enter PaymentMode:");
        pay = sc.next();
        
        Bike b = new Bike(id,engine,price,name,brand,color,pay);
        System.out.println("\n---------Bike Details---------------------");
        System.out.println(b);
        b.discount();
        System.out.println("-------------------------------------------");
	}

}

package encapsulation;

public class BikeInstallments {
 private	int id,engine,price,discountPrice,pay;
 private	String name,brand,color;
	
 public void setId(int id)
 {
	 this.id = id;
	 
 }
 public int getId()
 {
	 return id;
 }
 public void setEngine(int engine)
 {
	 this.engine = engine;
 }
 public int getEngine()
 {
	 return engine;
 }
 public void setPrice(int price)
 {
	 this.price = price;
 }
 public int getPrice()
 {
	 return price;
 }
 public void setPay(int pay)
 {
	 this.pay = pay;
 }
 public int getPay()
 {
	 return pay;
 }
 public int getDiscountedPrice()
 {
	 if(pay==1)
     {
       int  discountedPrice = price-price/100*20; 
       System.out.println("Discounted Prise Is:"+ discountedPrice);
      }
	 else if(pay==2)
	 {
      int discountedPrice = price-price/100*10; 
       System.out.println("Discounted Prise Is:"+ discountedPrice);
    }
	 else if (pay == 3) {
		 int discountedPrice = price-price/100*5; 
	       System.out.println("Discounted Prise Is:"+ discountedPrice);
	 }
	 else {
		 System.out.println("Should be no discount available!!!!!");
	 }
	return discountPrice;
 }
// public int getDiscountePrice()
// {
//	 return discountPrice;
// }
 public void setName(String name)
 {
	 this.name = name;
 }
 public String getName()
 {
	 return name;
 }
 public void setBrand(String brand)
 {
	 this.brand = brand;
	 
 }
 public String getBrand() {
	 return brand;
 }
 public void setColor(String color)
 
 {
	 this.color = color;
 }
 public String getColor()
 {
	 return color;
 }
}

package abstraction;

public class CarMain {

	public static void main(String[] args) {
		
		
		
		  Beleno b = new Beleno();
		  b.setColor("White");
		  b.setPrice(120000);
		  System.out.println("-------------------Baleno------------------------------------");
		  System.out.println(b.getColor()+" "+b.getPrice()); b.engine(); b.features();
		  b.dashboard();
		  System.out.println("--------------------Hunda City-----------------------------------");
		  Hunda_City h = new Hunda_City();
		  h.setColor("Blue");
		  h.setPrice(2400000);
		  
		  h.engine();
		  h.features(); 
		  h.dashboard();
		  System.out.println(h.getColor()+ " "+ h.getPrice());
		  System.out.println("-------------------Baleno Alpha------------------------------------");
		
		BalenoAlpha bb = new BalenoAlpha();
		bb.engine();
		bb.features();
        
	}

}

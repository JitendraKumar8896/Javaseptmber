package encapsulation;

public class Bike {

	public static void main(String[] args) {
		BikeInstallments b = new BikeInstallments();
		b.setId(101);
		b.setEngine(220);
		b.setPrice(135000);
		b.setPay(1);
		b.setName("pulsar");
		b.setBrand("bajaj");
		b.setColor("black");
	    System.out.println("Id \t"+"Engine\t"+"Price\t"+"Name\t"+"Brand\t"+"Color\t"+"Installment\t");
	    System.out.println("-----------------------------------------------------------------------");
        System.out.println(b.getId() +"\t "+ b.getEngine() +"\t "+ b.getPrice() +"\t "+ b.getName() +"\t "+ b.getBrand() +"\t "+ b.getColor()+"\t "+ b.getPay());
        System.out.println("-----------------------------------------------------------------------");
        b.getDiscountedPrice();
        
	}

}

package inheritance22;

public class MainMaruti {

	public static void main(String[] args) {
		Boleno  b = new Boleno();
		b.setName("Boleno");
		b.setColor("Gray");
		b.setPrice(1200000);
        b.setEngine("1248cc");
        b.setModelNo("Delta 2020");
        
        System.out.println(b.getName()+" "+b.getColor()+" "+b.getPrice()+" "+b.getEngine()+" "+b.getModelNo());
        
        
        SwiftDezire dd = new SwiftDezire();
		dd.setName("Swift Dezire");
		dd.setColor("Gray");
		dd.setPrice(1200000);
        dd.setSwiftEngine("1248cc");
        dd.setSwiftModelNo("Vxi 2020");
        System.out.println(dd.getName()+" "+dd.getColor()+" "+dd.getPrice()+" "+dd.getSwiftEngine()+" "+dd.getSwiftModelNo());
	}

}

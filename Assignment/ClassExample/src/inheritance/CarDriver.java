package inheritance;

public class CarDriver {

	public static void main(String[] args) {
		Driver d1 = new Driver(1,"Ramesh", "8896642066");
		Driver d2 = new Driver(2,"Ratnesh", "8896642066");
		Driver d3 = new Driver(3,"Amit", "9538448112");
		
		Car c1 = new Car(111,"Beleno","7654",d1);
		Car c2 = new Car(112,"Brezaa","7666",d2);
		Car c3 = new Car(113,"shift","7644",d3);
		
		System.out.println();
		System.out.println(c1);
		System.out.println();
		System.out.println(c2);
		System.out.println();
		System.out.println(c3);
		
	}

}

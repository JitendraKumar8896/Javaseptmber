package functioninterface;

public class FunctionalExample {

	public static void main(String[] args) {
		FunctionalEx fx =()-> System.out.println("In Display of FunctionEX");
		fx.display();
       
		Addition add = (a,b) -> System.out.println("Addition Is:"+(a+b));
		int a1 = 100, b1 = 200;
		 add.add(a1,b1);
		//add.display();
	}

}

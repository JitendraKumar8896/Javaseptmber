package instance22;

public class GrandFatherMain {

	public static void main(String[] args) {
		GrandFather fd= new GrandFather();
		Father f = new Father();
		Child c = new Child();
		fd.setData("Ramesh", "Kumar");
		f.setData1("Lalita", "Kumari");
		c.setData2("Ajay","D");
		System.out.println( fd.getData()+"\n "+f.getData1()+"\n "+c.getData2());
        
	}

}

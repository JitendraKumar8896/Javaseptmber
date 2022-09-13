package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		Employee e1 = new Employee();
        e1.setId(11);
        e1.setName("Jitendra");
        e1.setContect("8896642066");
        System.out.println("Id \t"+"Name\t\t"+"Contect\t");
        System.out.println("----------------------------------------");
        System.out.println(e1.getId()+ "\t " + e1.getName()+ " \t" +e1.getContect());
	}

}

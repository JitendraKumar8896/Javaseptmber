package gettersetter;

import constructor.Address;
import constructor.Person;

public class PersonOfAddress {

	public static void main(String[] args) {
		Address a = new Address("Khalilabad","\tUttar Pradesh","\tIndia",272175);
		Address a1 = new Address("Gorakhpur","\tUttar Pradesh","\tIndia",273001);
		Address a2= new Address("Lucknow","\tUttar Pradesh","\tIndia",226001);
		Address a3 = new Address("Delhi","\tDelhi","\t\tIndia",110001);
		Address a4 = new Address("Hydrabad"," \ttelangana","\tIndia",500001);

		

		Person p = new Person("Jitendra","Male\t",22, a);
		Person p1 = new Person("Harsha","\tMale\t",44, a1);
		Person p2= new Person("Shivani","Female\t",21, a2);
		Person p3 = new Person("Aditya","\tMale\t",23, a3);
		Person p4 = new Person("Nitesh","\tMale\t",12, a4);
		System.out.println("Name\tGender\t Age\t City\tState\t\tCountry\t Zip Code");
		System.out.println("-----------------------------------------------------------------------\n");
		System.out.println(p);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(p1);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(p2);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(p3);
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(p4);
		System.out.println("---------------------------------------------------------------------------");
		
	}

}

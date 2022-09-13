package constructor;

public class Person {
  String name,gender;
  int age;
  Address a;
  
  public Person(String name, String gender, int age, Address a)
  {
	this.name = name;
	this. gender = gender;
	this.age = age;
	this.a = a;
  }
  public String toString()
  {
	  return name +" "+gender+" "+age+ " "+a;
  }
}

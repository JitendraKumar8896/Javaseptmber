package gettersetter;

import constructor.Address;

public class Person {
	 private String name,gender;
	 private  int age;
	 Address a;
	  
	public void setName(String name)   
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getGender()
	{
		return gender;
	}
	
	public void setAge(int age)
	{
		this.age= age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setAddress (Address a)
	{
		this.a = a;
	}
	public Address getAddress()
	{
		return a;
	}
}

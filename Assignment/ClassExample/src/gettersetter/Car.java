package gettersetter;

import inheritance.Driver;

//import inheritance.Driver;

public class Car {
	 private int id;
	 private String name , contect;
	 Driver d;
public  void setId(int id)	
{
	this.id = id;
}
public int getId()
{
	return id;
}
public void setName(String name)
{
	  this.name = name;
	  //Driver d1 = new Driver(1,"Jitendra", "8896642066");// composition;
}
public String getName()
{
	  return name;
}
public void setContect(String contect)
{
	this.contect = contect;
}
public String getContect()
{
	return contect;
}
public void setDriver(Driver d)
{
	this.d = d;
}
public Driver getDriver()
{
	return d;
}
	 
}

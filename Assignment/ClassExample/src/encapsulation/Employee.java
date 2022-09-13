package encapsulation;

public class Employee {
  private int id;
  private String name , contect;
  public void setId(int id)
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
  
}

package instance22;

public class GrandFather {
public  static String lastname ="Malhotra" ;
String fname, middlname;

public void setData(String fname, String middlname)
{
	this.fname = fname;
	this.middlname = middlname;
}
  public String getData()
  {
	  return fname+" "+middlname+" "+lastname;
  }
}

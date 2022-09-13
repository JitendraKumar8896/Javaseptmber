package instance22;

public class Father extends GrandFather {
public String  fname, middname;

public void setData1(String fname, String middname)
{
	this.fname = fname;
	this.middname = middname;
}
public  String getData1()
{
	return fname+" "+middname+" "+lastname;
}
}

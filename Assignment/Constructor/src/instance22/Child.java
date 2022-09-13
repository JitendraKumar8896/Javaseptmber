package instance22;

public class Child  extends GrandFather{
	String fname,middname;
	public void setData2(String fname, String middname)
	{
		this.fname = fname;
		this.middname = middname;
	}
	public  String getData2()
	{
		return fname+" "+middname+" "+lastname;
	}
}

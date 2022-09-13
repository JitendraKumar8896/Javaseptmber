package inheritance;

public class TimeGetSet extends MyDateGetSet {
	private int hrs,mins,secs;
	
	public void setHr(int hrs)
	{
		this.hrs = hrs;
	}
	public int getHr()
	{
		return hrs;
	}
	
	public void setMin(int mins)
	{
		this.mins = mins;
	}
	public int getMin()
	{
		return hrs;
	}
	
	public void setSec(int secs)
	{
		this.secs = secs;
	}
	public int getSec()
	{
		return secs;
	}
	
	public int getDay()
	{
		return dd;
	}
	public int getMonth()
	
	{
	    return mm;	
	}
	public int getYear()
	{
		return yy;
	}
}

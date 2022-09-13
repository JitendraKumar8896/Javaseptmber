package inheritance22;

public class Time extends Date {
	protected int hours, minuts,seconds;
	
	public void setHours(int hours)
	{
		this.hours = hours;
		
	}
	public void setMinuts(int minuts)
	{
		this.minuts = minuts;
	}
	public void setSeconds(int seconds)
	{
		this.seconds = seconds;
	}
	public int getHours()
	{
		return hours;
	}
	public int getMinuts()
	{
		return minuts;
		
	}
	public int getSeconds()
	{
	  return seconds;	
	}
	

}

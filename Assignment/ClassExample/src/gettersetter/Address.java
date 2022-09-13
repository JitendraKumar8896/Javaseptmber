package gettersetter;

public class Address {
	private String city,state,country;
	private  int pin;
	
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return state;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return country;
	}
	public void setPin(int pin)
	{
		this.pin = pin;
	}
	public int getPin()
	{
		return pin;
	}
}

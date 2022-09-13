package constructor;

public class Address {
  String city,state,country;
  int pin;
  public Address(String city,String state ,String cn,int pin)
  {
	  this.city = city;
	  this.state = state;
	  this.country = cn;
	  this.pin = pin;
  }
   public String toString()
   
   {
	   return city+ " "+ state+ " "+country+" "+pin; 
   }
}

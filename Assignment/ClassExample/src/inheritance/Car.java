package inheritance;

public class Car {
   int id ;
   String name, cnumber;
   Driver d;
   public Car(int id,String name,String contect, Driver d)
   {
	   this.id =id;
	   this.name = name;
	   this.cnumber = contect;
	   this.d =d;
   }
   public String toString()
   {
	   return  id + " "+name+" "+cnumber +" "+d;
   }
}

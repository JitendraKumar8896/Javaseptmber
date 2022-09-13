package inheritance;

public class Driver {
     int id;
     String name,contect;
     
     public Driver(int id , String name, String contect)
     {
    	 this.id =id;
    	 this.name = name;
    	 this.contect = contect;
     }
     
     public String toString()
     {
    	 return  name+" "+contect;
     }
}
     

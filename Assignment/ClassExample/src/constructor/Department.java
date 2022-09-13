package constructor;

public class Department {
    int id;
    String stream;
    Student s ;
    public Department(int id, String stream,Student s)
    {
    	this. id = id;
    	this.stream = stream;
    	this.s = s;
    }
    public String toString()
    {
    	return id +" "+stream+ " "+s;
    }
}

package person;

public class IdProof extends Person{
 String idname,number;
 String validity;

public String getValidity() {
		return validity;
	}

public void setValidity(String validity) {
		this.validity = validity;
	}
public String getIdName() {
	return idname;
}

public void setIdName(String idname) {
	this.idname = idname;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}
void display()
{
	 if((address.equals("Pune")) && (idname.equals("adhar Card")))
	 {
		System.out.println(getId()+""+getName()+""+getContact()+" "+getAddress()+" " +getIdName()+" "+getNumber()+" "+getValidity()); 
	 }
	 else
	 {
		 System.out.println("Not Available Any Person!!");
	 }
}

 
 
}

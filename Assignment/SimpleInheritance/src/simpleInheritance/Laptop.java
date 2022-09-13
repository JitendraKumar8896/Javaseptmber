package simpleInheritance;

public class Laptop extends MotherBoard{

	public static void main(String[] args) {
		 Laptop ll = new Laptop();
		 ll.setNoOfUSBPort(4);
		 ll.setProcessorSpeed(" 2.30GHz ");
         ll.setName("Lenevo");
         System.out.println("USB Port : Processor Speed : name");
         System.out.println("--------------------------------------------------------");
         System.out.println(ll.getNoOfUSBPort()+"\t\t "+ll.getProcessorSpeed()+" \t"+ll.getName());
	}

}

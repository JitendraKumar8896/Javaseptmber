package simpleInheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Dog d=new Dog();    //create an object of derived class  
        System.out.print("The dog is ");
        d.barks();    //call derived class method
        System.out.print("\nThe dog is ");
        d.eating(); 

	}

}

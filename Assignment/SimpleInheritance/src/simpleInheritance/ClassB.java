package simpleInheritance;

class A {
       int x;
       int y;
       int z;
    int getSum(int x, int y)
    {
    	z = x+y;
       return z;
    }
    void show(){
    System.out.println("Sum :"+z);
   }
}

public class ClassB  extends A{
	public static void main(String[] args) {
		A a = new A();
		a.getSum(5,6);
		a.show();
		}

	}



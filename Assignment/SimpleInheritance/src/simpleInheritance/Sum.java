package simpleInheritance;

public class Sum {
  int a,b;
  int c;
  public void sum(int a, int b)
  {
	  this.a = a;
	  this.b = b;
  }
  public void show()
  {
	  c = a+b;
	  System.out.println("Sum Is:"+c);
  }
}

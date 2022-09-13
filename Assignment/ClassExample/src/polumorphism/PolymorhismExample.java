package polumorphism;

public class PolymorhismExample {
	PolymorhismExample(int r, float pi)
	{
		float area = pi*r*r;
		System.out.println("Area Of Circle:"+area);
	}
	PolymorhismExample(int s)
	
	{
		int square = s*s;
		System.out.println("Square Is:"+square);
	}
	PolymorhismExample(int w, int h)
	{
		int rectangle = w*h;
		System.out.println("Area Of Rectangle :"+rectangle);
	}
	   
	public static void main(String[] args) {
		PolymorhismExample p1 = new PolymorhismExample(4, 3.14f);
		PolymorhismExample p2 = new PolymorhismExample(5);
		PolymorhismExample p3 = new PolymorhismExample(5,7);
 	  
	}

}

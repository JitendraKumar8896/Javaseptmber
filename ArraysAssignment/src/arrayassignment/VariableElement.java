package arrayassignment;


public class VariableElement {
static	void add(String b ,int...a)
	{
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Addition is:"+sum);
	}

static	void add(int...a)
{
	int sum =0;
	for(int i=0;i<a.length;i++)
	{
		sum = sum+a[i];
	}
	System.out.println("Addition is:"+sum);
}

	public static void main(String[] args) {
	    int a[] = {1,2,3,4,5,6};
	    int  b[] = {4,5,7,8,9};
	  //  VariableElement d = new VariableElement();
	    VariableElement.add(a);
	    VariableElement.add(b);

	}

}

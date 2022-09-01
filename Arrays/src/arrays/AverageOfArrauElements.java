package arrays;

public class AverageOfArrauElements {
	
	
	void averageOfArray(int a[] ){
		int sum=0;
		double d=0.0;
		
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			d=sum/a.length;
			
		}
		
		System.out.println(d);
		
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {52,40,30,50,35,50};
		
		
		
		AverageOfArrauElements obj=new AverageOfArrauElements();
		obj.averageOfArray(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

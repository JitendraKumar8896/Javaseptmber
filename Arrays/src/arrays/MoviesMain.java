package arrays;

import java.util.Scanner;

public class MoviesMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size Of Arrays:");
        int size = sc.nextInt();
		Movies m[] = new Movies[size];
		
		 for(int i=0; i<size;i++)
		 {
			 System.out.println("Enter the MovId,Release Year ,Movies Name, ProducerName,BoxOfficeCollection:");
			   int movId = sc.nextInt();
	           int releaseyear = sc.nextInt();
	           String moviname = sc.next();
	           String producername = sc.next();
	           double boxcollection = sc.nextInt();
	           m[i] = new Movies(movId,releaseyear,moviname,producername,boxcollection);
	           
	           
		 }
		 
		 for(Movies mov : m)
		 {
			 if(mov.boxcollection>=5000000 && mov.producername.equalsIgnoreCase("RajaMauli"))
			 {
				 System.out.println("Produce name:"+mov.producername+"\tBox Office collection:"+mov.boxcollection); 
			 }
		 }

	}

}

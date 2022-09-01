package arrays;

public class Movies {
   int movId,releaseyear; 
   String moviname, producername;
   double boxcollection;
  public Movies(int movId,int releaseyear,String moviname,String producername,double boxcollection)
   {
	   this.movId = movId;
	   this.releaseyear = releaseyear;
	   this.moviname = moviname;
	   this.producername = producername;
	   this.boxcollection = boxcollection;
			   
   }
   public String toString()
   {
	   return movId+ " "+ releaseyear+" "+moviname+" "+producername+" "+boxcollection;
   }
}

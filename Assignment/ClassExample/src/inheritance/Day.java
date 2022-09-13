package inheritance;

public class Day extends TimeDay {
     String day;
     void setDay(String day)
     {
    	 this.day = day;
     }
     void display()
     {
    	 System.out.println(hrs+":"+mins+":"+secs+"/"+dd+"/"+mm+"/"+yy);
    	 System.out.println(day);
     }
}

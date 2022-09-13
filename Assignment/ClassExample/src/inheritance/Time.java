package inheritance;

public class Time extends MyDate{
  int hrs,min,sec;
  void setTime(int hrs,int min,int sec)
  {
	  this.hrs = hrs;
	  this.min = min;
	  this.sec = sec;
  }
  void display()
  {
	  System.out.println(dd+"/"+mm+"/"+yy+"/"+hrs+"/"+min+"/"+sec);
  }
}

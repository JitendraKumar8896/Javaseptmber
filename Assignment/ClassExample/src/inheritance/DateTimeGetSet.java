package inheritance;

public class DateTimeGetSet {

	public static void main(String[] args) {
		TimeGetSet t = new TimeGetSet();
		t.setHr(4);
		t.setMin(15);
		t.setSec(44);
        t.setDay(16);
        t.setMonth(8);
        t.setYear(2022);
        System.out.println(t.getDay()+"/"+t.getMonth()+"/"+t.getYear()+"/"+t.getHr()+":"+t.getMin()+":"+t.getSec());
	}

}

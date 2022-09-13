package inheritance22;

public class MyDate {

	public static void main(String[] args) {
		Day d1 = new Day();
		d1.setDay("Monday");
		d1.setHours(4);
		d1.setMinuts(44);
		d1.setSeconds(33);
		d1.setDd(17);
		d1.setMonth(8);
		d1.setYear(2022);
		System.out.println(d1.getDay());
        System.out.println(d1.getDd()+"/"+d1.getMonth()+"/"+d1.getYear());
        System.out.println(d1.getHours()+":"+d1.getMinuts()+":"+d1.getSeconds());
	}

}

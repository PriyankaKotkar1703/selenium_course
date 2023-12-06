package selenium_course;

public class TimeConversion {

	public static void main(String[] args) {
		int secondsin = 86399 ;
		int seconds = secondsin % 60;
		int hour = secondsin /60;
		int minute = hour % 60;
	    hour = hour /60;
	    System.out.println(hour+"Hour "+": "+minute+"minute : "+seconds+" seconds");
		

	}

}

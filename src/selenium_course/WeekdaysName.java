package selenium_course;

import java.util.Scanner;

public class WeekdaysName {

	public static void main(String[] args) {
		 int dayno;
		 Scanner p=new Scanner(System.in);

		    System.out.print("Enter day number (1-7): ");
		    dayno  = p.nextInt();
		    if(dayno == 1)
		    {
		        System.out.println("Monday");
		    }
		    else if(dayno == 2)
		    {
		        System.out.println("Tuesday");
		    }
		    else if(dayno == 3)
		    {
		        System.out.println("Wednesday");
		    }
		else if(dayno == 4)
		    {
		        System.out.println("Thursday");
		    }
		    else if(dayno == 5)
		    {
		        System.out.println("Friday");
		    }
		    else if(dayno == 6)
		    {
		        System.out.println("Saturday");
		    }
		    else if(dayno == 7)
		    {
		        System.out.println("Sunday");
		    }
		    else 
		    	System.out.println("Enter valid day number");
		    	
	}

}

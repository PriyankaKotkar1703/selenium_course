package selenium_course;

public class DevisibleByThree {

	public static void main(String[] args) {
		int i;
		System.out.println("Numbers devisible by 3 are:-");
		for(i=1;i<100;i++)
		{
			if(i%3==0)
			{ 
				System.out.print(i +" ");
			}
		}
		System.out.println("Numbers devisible by 5 are:-");
		for(i=1;i<100;i++)
		{
			if(i%5==0)
			{
				
				System.out.print(i+" ");
				//System.out.println();
			}
		}
		System.out.println("Numbers devisible by 3 & 5 are:-");

		for(i=1;i<100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				
				System.out.print(i+" ");
			}
		}
	}

}

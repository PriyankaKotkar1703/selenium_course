package selenium_course;

public class Reversenumber {

	public static void main(String[] args) {
int num = 345, reversed=0;
System.out.println("Original number:-->"+ num);
while(num != 0)
{
int digit = num % 10;
reversed = reversed * 10 + digit;
num = num/10;
}
System.out.println("Reversed Number: " + reversed);

}
}

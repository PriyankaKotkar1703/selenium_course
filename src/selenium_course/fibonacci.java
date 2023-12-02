package selenium_course;

public class fibonacci {

public static void main(String args[]) {
int n=10, firstno=0,secondno=1;
for(int i=1;i<=10;++i)
{
	System.out.println(firstno +" ");
	int nxt = firstno+secondno;
	firstno= secondno;
	secondno= nxt;
}
}
}
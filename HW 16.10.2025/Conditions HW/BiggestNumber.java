import java.util.Scanner;

class BiggestNumber 
{
	public static void main (String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Number");
	int a=sc.nextInt();
	System.out.println("Enter the Second Number");
	int b=sc.nextInt();
	
	if(a<b)
	{
		System.out.println(b+"  Is Biggest Number");
	}
	else
	{
	System.out.println(a+"  Is Biggest Number");
	}
	}
}
import java.util.Scanner;

class Marks
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter The Mark");
		int mark = Sc.nextInt();
		if(mark>90)
		{
			System.out.println("Your are in A grade");
		}
		else if(mark>70&&mark<=90)
		{	
		    System.out.println("Your are in B grade"); 
		}
		else if(mark>50&&mark<=70)
		{
			System.out.println("Your are in C grade");
		}
		else if(mark>=25&&mark<=50)
		{
			System.out.println("Your are in D grade");
		}
		else if(mark<25)
		{
			System.out.println("You are Fail");
		}
		else
		{
			System.out.println("Invalid Entry");
		}
	}
}
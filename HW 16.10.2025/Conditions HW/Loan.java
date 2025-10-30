import java.util.Scanner;

class Loan
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age= Sc.nextInt();
		System.out.println("Enter your Monthly Income");
		long income= Sc.nextLong();
		
		if(age>21&&income>25000)
		{
			System.out.println("You are eligible for a loan");
		}
		else
		{
			System.out.println("You are not eligible for a loan");
		}
	}
}
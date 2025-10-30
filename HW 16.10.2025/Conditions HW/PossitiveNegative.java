import java.util.Scanner;

class PossitiveNegative
{
	public static void main (String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	
	if(num>0)
	{
		System.out.println("Given Number is Possitive");
	}
	else if(num==0)
	{
	System.out.println("Given Number is Nuetral");
	}
	else
	{
	System.out.println("Given Number is Negative");
	}
	}
}
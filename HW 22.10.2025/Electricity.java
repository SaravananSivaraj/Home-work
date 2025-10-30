import java.util.Scanner;
class Electricity
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of units consumed:");
		int units=sc.nextInt();
		int bill=0;
		if(units<=100)
		{
			bill=units*5;
			System.out.println("Electricity Bill amount:Rs."+bill);
		}
		else if(units<=200)
		{
			bill=units*7;
			System.out.println("Electricity Bill amount:Rs."+bill);
		}
		else 
		{
			bill=units*10;
			System.out.println("Electricity Bill amount:Rs."+bill);
		}
	}
}
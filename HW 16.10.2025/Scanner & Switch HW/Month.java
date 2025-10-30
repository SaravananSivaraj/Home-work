import java.util.Scanner;

class Month
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Month Number between 1 to 12");
		int num = Sc.nextInt();
		
		switch (num)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
			case 11:
			System.out.println("There are 31 days in this Month");
			break;
			
			case 4:
			case 6:
			case 8:
			case 10:
			case 12:
			System.out.println("There are 30 days in this Month");
			break;
			
			case 2:
			System.out.println("February has 28 days(29 in leap year)");
			break;
			
			default:
			System.out.println("Invalid Month Number");
		}
	}
}
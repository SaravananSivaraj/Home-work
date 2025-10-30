import java.util.Scanner;

class Train
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Select the Class");
		System.out.println("1. General");
		System.out.println("2. First Class");
		System.out.println("3. Sleeper Class");
		System.out.println("4. AC-2 Tier");
		System.out.println("5. AC-3 Tier");
		
		int num = Sc.nextInt();
		
		switch(num)
		{
			case 1:
			System.out.println("General 100 Rs");
			break;
			
			case 2:
			System.out.println("First Class 150 Rs");
			break;
			
			case 3:
			System.out.println("Sleeper Class 300 Rs");
			break;
			
			case 4:
		    System.out.println("AC-2 Tier 500 Rs");
			break;
			
			case 5:
			System.out.println("AC-3 Tier 600 Rs");
			break;

			
			default:
			System.out.println("Invalid class");
		}
	}
}
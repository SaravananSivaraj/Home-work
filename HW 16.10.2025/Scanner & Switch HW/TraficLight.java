import java.util.Scanner;

class TraficLight
{
	public static void main (String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Color");
	String ch=sc.next().toLowerCase();
	
	switch(ch)
	{
		case "red":
		System.out.println("Stop");
		break;
		case "green":
		System.out.println("Go");
		break;
		case "yellow":
		System.out.println("Ready");
		break;
		
		
		default:
		System.out.println("given color is invalid");
	}
	}
}
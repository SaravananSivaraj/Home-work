import java.util.Scanner;

class VowelSwitch
{
	public static void main (String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character");
	char ch=sc.next().toLowerCase().charAt(0);
	
	switch(ch)
	{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("given char is vowel");
		break;
		
		default:
		System.out.println("given input is not vowel");
	}
	}
}

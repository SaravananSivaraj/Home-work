import java.util.Scanner;

class Vowel
{
	public static void main (String [] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Character");
	char input=sc.next().charAt(0);
	input=Character.toLowerCase(input);
	
	if((input == 'a')||(input=='e')||(input=='i')||(input=='o')||(input=='u'))
	{
		System.out.println(input + "Given char is Vowel");
	}
	else if (input>='a' && input<='z')
	{
	    System.out.println(input +  " Given char is consonant");
	}
	else
	{
	    System.out.println("invalid input");
	}
	}
}
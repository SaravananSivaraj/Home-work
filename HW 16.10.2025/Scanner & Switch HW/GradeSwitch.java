import java.util.Scanner;

class GradeSwitch
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your grade");
		char a=Sc.next().charAt(0);
		
		switch(a)
		{
		case 'A':
		System.out.println("Very Very Good");
		break;
		
		case 'B':
		System.out.println("Very Good");
		break;
		
		case 'C':
		System.out.println("Good");
		break;
		
		case 'D':
		System.out.println("Just Pass");
		break;
		
		case 'F':
		System.out.println("Fail");
		break;
		
		default:
		System.out.println("Invalid");
		}
    }
}
import java.util.Scanner;
class PrintNumber
{
	public static void main(String [] args)
	{
 		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length : ");
		int len = sc.nextInt();
		int ar[] = new int[len];
		for(int i=0; i<ar.length;i++)
			{
			System.out.print("Enter the " + i + " Number: ");
			ar[i] = sc.nextInt();
			}
		for(int i=0; i<len;i++)
			{
			System.out.print("The " +i+ " Index value is : " + " " +ar[i]);	
			}
			
	}
}
import java.util.Scanner;
class BigNumber
{
	public static void main(String [] args)
	{
 		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total Number of counts : ");
		int len = sc.nextInt();
		int max = 0;
		
		for(int i=0;i<len;i++)
			{
			System.out.println("Enter the Number:");
			int num=sc.nextInt();
			if(num>max)
				{
				max=num;
				}
			}
			System.out.println("The biggest Number is:"+max);
	}
}	
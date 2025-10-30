class Palindrome
{
	public static void main(String[] args)
	{
		int a=242;
		int b=a;
		int c=a%10; 
		int d=a/10; 
		int e=d%10; 
		int f=d/10; 
		int rev=(100*c)+(10*e)+(1*f);
		boolean g=(a==rev);
		
		System.out.println(g);
	}
}
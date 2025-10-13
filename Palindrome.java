class Palindrome
{
	public static void main(String[] args)
	{
		int a=151;
		int b=a;
		int c=a%10;
		int d=a/10;
		int e=d%10;
		int f=(c*1)+(e*10)+(c*100);
		boolean g=f==b;
		System.out.println(g);
	}
}
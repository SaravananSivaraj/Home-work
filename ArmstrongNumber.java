class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int a=155;
		int b=a;
		int c=a%10;
		int d=a/10;
		int e=d%10;
		int f=d/10;
		int g=(f*f*f)+(e*e*e)+(c*c*c);
		boolean h=g==b;
		System.out.println(h);
	}
}
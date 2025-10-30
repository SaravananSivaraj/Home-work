class Armstrong1
{
	public static void main(String[] args)
	{
		int a=5678;
		int b=a;
		int c=a%10; 
		int d=a/10; 
		int e=d%10; 
		int f=d/10; 
		int g=f%10; 
		int h=f/10; 
		int sum=(h*h*h*h)+(g*g*g*g)+(e*e*e*e)+(c*c*c*c);
		boolean z=(sum==b);
		
		System.out.println(z);
	}
}
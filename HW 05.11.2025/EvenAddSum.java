class EvenAddSum
{
	public static void main(String []args)
	{
		int ar[]={13,6,25,12,7,14,32,1,17};
		int a=0;
		int b=0;
		int ecount=0;
		int ocount=0;
		for(int i =0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
			a=a+ar[i];
			ecount++;
			}
			else
			{
				b=b+ar[i];
				ocount++;
			}
			
		}
		    System.out.println("Sum of Even Numbers is:"+a);
			System.out.println("Sum of Odd Numbers is:"+b);
			System.out.println("Total count of Even Numbers is:"+ecount);
			System.out.println("Total count of Odd numbers is:"+ocount);
	}
}
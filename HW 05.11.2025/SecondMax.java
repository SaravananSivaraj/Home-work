class SecondMax
{
	public static void main(String[]args)
	{
		int ar[]={28,16,13,7,15,23,2};
		int max =0;
		int smax=0;
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i]>smax) && (ar[i]<max))
			{
				smax=ar[i];
			}
		}
		System.out.println("Secont max Number is:"+smax);
	}
}
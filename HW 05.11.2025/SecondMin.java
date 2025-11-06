class SecondMin
{
	public static void main(String[]args)
	{
		int ar[]={28,16,13,7,15,23,2};
		int min =ar[0];
		int smin=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("Second min Number is:"+min);
		for(int i=0;i<ar.length;i++)
		{
			if((ar[i]<smin) && (ar[i]>min))
			{
				smin=ar[i];
			}
		}
		System.out.println("Second min Number is:"+smin);
	}
}
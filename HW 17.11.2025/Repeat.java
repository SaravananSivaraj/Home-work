class Repeat
{
	public static void main(String[] args)
	{
		int ar[]={1,2,2,2,3,4};
		int target=2;
		Repeat rc=new Repeat();
		int res=rc.count(ar,target);
		System.out.println("The Count of 2 is: "+res);
	}
	int count(int ar[],int target)
	{
		int repeatCount=0;
		for(int i=0;i<ar.length;i++)
		{
		   if(ar[i]==target)
		   {
			  repeatCount++;
		   }
		}
		return repeatCount;
	}
}
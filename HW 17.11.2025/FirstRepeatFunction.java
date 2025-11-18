class FirstRepeatFunction
{
	int repeat(int ar[],int target)
	{
		int start=0;
		int end=ar.length-1;
		int mid=0;

        for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					return ar[i];
				}
			}
		}
		return -1;
	}
    
}
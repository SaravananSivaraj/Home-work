class MaxFunction
{
	int findMax(int ar[],int max,int i)
	{
		if(i<ar.length)
		{
		if(ar[i]>max)
		{
			max=ar[i];
		}
		return findMax(ar,max,++i);
		}
		return max;
	}
}
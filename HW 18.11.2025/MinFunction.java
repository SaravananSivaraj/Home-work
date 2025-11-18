class MinFunction
{
	int findMin(int ar[],int min,int i)
	{
		if(i<ar.length)
		{
		if(ar[i]<min)
		{
			min=ar[i];
		}
		return findMin(ar,min,++i);
		}
		return min;
	}
}
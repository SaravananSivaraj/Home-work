class SumFunction
{
	int sumArray(int ar[],int sum,int i)
	{
		if(i==ar.length)
		{
			return sum;
		}
		sum=sum+ar[i];
		return sumArray(ar,sum,++i);
	}
}
class SumMain
{
	public static void main(String[] args)
	{
		int ar[]={0,3,5,7,8,9,2,1,4};
		int sum=0;
		int i=0;
		
		SumFunction as=new SumFunction();
		int res=as.sumArray(ar,sum,i);
		System.out.println("Sum of the array is: "+res);
	}
}
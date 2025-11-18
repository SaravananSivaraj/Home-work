class MissingNumber
{
	public static void main(String[] args)
	{
		int ar[]={1,2,4,6,7,8,5};
		MissingNumber mn=new MissingNumber();
		int res=mn.missing(ar);
        System.out.println("Missing Number is: "+res);		
	}
	int missing(int ar[])
	{
		int n=ar.length+1;
	    int sumofn=n*(n+1)/2;
		int sumofar=0;
		for(int i=0;i<ar.length;i++)
		{
			sumofar=sumofar+ar[i];
		}
		int missingNum=sumofn-sumofar;
		return missingNum;
	}
}
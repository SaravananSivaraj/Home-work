class MinMain
{
	public static void main(String[] args)
	{
		int ar[]={10,20,30,40,50,60,70,80,90};
		int min=ar[0];
		int i=0;
		
		MinFunction mf=new MinFunction();
		System.out.println(mf.findMin(ar,min,i));
		
	}
}
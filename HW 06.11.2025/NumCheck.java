class NumCheck
{
	public static void main(String[] args)
	{
		NumCheck n = new NumCheck();
		int ar[] = {10,20,30,-40,-90,50,60};
		n.PositiveNegative(ar);
	}
	void PositiveNegative(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>0)
			{
				System.out.println("positive number = "+ar[i]);
			}
			else
			{
				System.out.println("negative number = "+ar[i]);
			}
		}
	}
}
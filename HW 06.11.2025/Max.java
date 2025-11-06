class Max
{
	public static void main(String[] args)
	{
		Max m = new Max();
		int result = m.Maximum(8, 60);
		System.out.println(result);
	}
	
	int Maximum(int a, int b)
	{
		int max = 0;
		if(a<b)
		{
			max = b;
		}
		else 
		{
			max = a;
		}
		return max;
	}
}
class SI
{
	public static void main(String[] args)
	{
		SI s = new SI();
		float result = s.Interest(20000, 2, 10);
		System.out.println(result);
	}
	
	float Interest(int p, int n, int r)
	{
		float sum = (p*n*r)/100.0f;
		return sum;
	}
}
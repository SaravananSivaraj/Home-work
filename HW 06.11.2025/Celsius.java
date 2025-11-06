class Celsius
{
	public static void main(String[] args)
	{
	    Celsius c = new Celsius();
		float result=c.Convert(25);
		System.out.println(result);
	}
	
	float Convert(int c)
	{
		float sum = (c * 9/5) + 32;
		return sum;
	}
}
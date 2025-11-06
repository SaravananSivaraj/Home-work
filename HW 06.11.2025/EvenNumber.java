class EvenNumber
{
	public static void main(String [] args)
	{
		EvenNumber e = new EvenNumber();
		boolean result = e.Even(8);
		System.out.println(result);
		
	}
	boolean Even(int a)
	{
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
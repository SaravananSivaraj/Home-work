class AddNumber
{
	public static void main(String[] args)
	{
		AddNumber a = new AddNumber();
		int result = a.add(30, 45);
		System.out.println(result);
	}
	int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
}
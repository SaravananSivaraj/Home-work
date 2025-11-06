class Square
{
	public static void main(String[] args)
	{
		Square s = new Square();
		int result = s.SquareOf(5);
		System.out.println(result);
	} 
	int SquareOf(int a)
	{
		int sum = a*a;
		return sum;
	}
}
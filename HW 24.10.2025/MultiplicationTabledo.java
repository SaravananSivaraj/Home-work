class MultiplicationTabledo
{
	public static void main(String[] args)
	{
		int n=5;
		int l=10;
		int k=1;
			do
			{
				System.out.println("using do while loop:");
				int c=n*k;
				System.out.println(c);
				k++;
			}while(k<=l);
	}
}
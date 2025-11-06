class Table
{
	public static void main(String[] args){
		Table t = new Table();
		t.multi(8);
		
	}
	
	void multi(int a)
	{
		for(int i=1; i<=a; i++)
		{
			for(int j=1;j<=10;j++)
			{
				int result = i*j;
				System.out.println(i+"x"+j+"="+result);
			}
		}
	}
}
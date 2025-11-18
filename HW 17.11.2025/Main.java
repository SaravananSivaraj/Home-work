class Main
{
	public static void main(String [] args)
	{
		int ar[]={10,5,3,4,3,5,6};
		Main m=new Main();
		int res=m.find(ar);
		System.out.println(res);
	}
	int find (int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					return ar[i];
				}
			}
		}
		return -1;
	}
}
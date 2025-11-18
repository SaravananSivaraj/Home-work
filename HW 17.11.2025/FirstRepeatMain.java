class FirstRepeatMain
{
	public static void main(String[] args)
	{
		int ar[]={10,5,3,4,3,5,6};
		int target=5;
		
		FirstRepeatFunction fr=new FirstRepeatFunction();
		int res=fr.repeat(ar,target);
		System.out.println(res);
		
	}
}
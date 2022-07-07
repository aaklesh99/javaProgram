class Fibonacci
{
	public static void main(String args[])
	{
		int i=0,j=1,tot;
		System.out.print(i);
		System.out.print(j);
		for(i=1;i<=5;i++)
		{
			tot=i+j;
			i=j;
			j=tot;
			System.out.print(tot);
		}
	}
}
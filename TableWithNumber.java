import java.util.Scanner;
class TableWithNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,i,j;
		System.out.println("Enter first number :");
		num1=sc.nextInt();
		System.out.println("Enter second number :");
		num2=sc.nextInt();
		for(i=num1;i<=num2;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.print((i*j)+" ");
			}
		System.out.println();
		}
	}
}
			
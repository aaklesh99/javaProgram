class A1{
	public void fun1(){
		System.out.println("Function from class A1");
	}
}
class B1 extends A1{
	public void fun2(){
		System.out.println("Function from class B1"); 
	}
}
class B2 extends A1{
	public void fun3(){
		System.out.println("Function from class B2"); 
	}
}
public class Inheritance extends A1
{
	public static void main(String args[])
	{
		A1 a = new A1();
		a.fun1();
		B1 b1 = new B1();
		B2 b2 = new B2();
		a.fun1();

		b1.fun1();
		b1.fun2();

		b2.fun1();
		b2.fun3();
	}
}
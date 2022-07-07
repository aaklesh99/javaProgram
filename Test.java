class A
{
void f1()
{
System.out.println(“Parent function");
}
}
class B extends A
{
void f1()
{
System.out.println(“Child Function");
}
}
class Test
{
public static void main(String args[])
{
A a1=new B();
a1.f1();	//Will call the Child Version 	//because of Late Binding
	//in Function Overriding
}
}

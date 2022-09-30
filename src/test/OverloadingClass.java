package test;

public class OverloadingClass {

	
	public void myMethod(String str)
	{
		System.out.println(str);
	}
	
	public void myMethod(String str, int i)
	{
		System.out.println(str + i);
		
	}
	
	public void myMethod(int str)
	{
		System.out.println(str);
	}
}

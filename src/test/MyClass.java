package test;

import qa.qaClass;
import qa.qaClass1;

public class MyClass 
{

	static int i;
	static String name="6";
	
	
	public static void main(String[] args) {
		//MyClass myClass = new MyClass(7);
		MyClass.init();
		System.out.println(MyClass.i);
		System.out.println();
		qaClass qaclass = new qaClass();
		qaclass.myMethod();
		qaClass1 qaclass1 = new qaClass1();
		qaclass1.myQaMethod1();
		
	}
	
	public static void init() {
		i=5;
		int j = Integer.parseInt(name);
		System.out.println(j);
		name= String.valueOf(i);
		System.out.println(name);
	}
	
	public MyClass() {
		i=6;
	}
	
	public MyClass(int i)
	{
		this.i=i;
	}

}

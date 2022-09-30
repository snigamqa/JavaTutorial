package test;

public class EncapsulationDemo {
	
	private String mystring = "My String";
	
	public String getString()
	{
		return mystring;
	}
	
	private void setString(String mystring)
	{
		this.mystring = mystring;
	}

	private void myEncap()
	{
		System.out.println("My encap method");
	}
}

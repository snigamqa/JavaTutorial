package test;

public class MyPoly {

	public static void main(String[] args) {
		Employee emp = new FullTime();
		System.out.println("Full Time emp salary is " +emp.salary());
		
		emp = new Contractor();
		System.out.println("Contactor emp salary is " +emp.salary());
		
		OverloadingClass overl = new OverloadingClass();
		
		overl.myMethod("Sandeep");
		overl.myMethod(1);
		overl.myMethod("Sandeep", 1);
	}

}

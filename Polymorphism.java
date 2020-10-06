class A{
	public void method(int x) {                   //<--------
		System.out.println(x);								// 	THESE ARE METHODS HAVING SAME NAME OF DIFF ARGUMETS.
	}													   //  IT IS CALLED # METHOD OVERLOADING.DEPENDING UPON PARAMETER PASSED
	public void method(int x, float b) {		//<--------    RESPECTIVE METHOD WILL BE CALLED. SO DECISION IS TAKEN AT COMPLILE TIME.
		System.out.println(x+b);			               // SO CALLED AS COMPILE-TIME POLYMORPHISM OR EARLY POLYMORPHISM OR STATIC 
	}													   // BINDING.
	public A(int x) {
		System.out.println("This is " + x);		// CONSTRUCTOR CAN BE CALLED BY OBJECT OF CLASS OR OBJECT OF CHILD CLASS WHEN 
	}											// WHEN IT IS CREATED.
}

class B extends A{
	public void method(int x) {				//METHOD FROM PARENT CLASS IS OVERRIDED HERE. ITS IS # METHOD OVERRIDING.
		System.out.println(x+100);
	}
	public B() {
		super(3);							// WHEN OBJECT OF CHILD IS CREATED IT WILL CALL ITS CONSTRUCTOR AND THAT WILL CALL
		System.out.println("Ohh NO NO NO NO");  		// PARENT CLASS CONSTRUCTOR USING # super();	which is by default here
		}
}

public class Polymorphism {
	public static void main(String[] args) {
		B c= new B();
		c.method(10);			//THIS IS OVERRIDED METHOD SO CHILD OBJECT WILL USE ITS OWN METHOD. THIS IS DECIDE AT RUNTIME.
								//DUE TO THIS RUNTIME-POLYMORPHISM OR LATE POLYMORPHISM OCCURS OR DYNAMIC METHOD DISPATCH OR DYNAMIC BINDING.
		c.method(2,4.5f);		//THIS METHOD IS NOT OVERRIDED SO CHILD OBJECT WILL CALL A METHOD THAT IT HAS INHERITED.
	}
}

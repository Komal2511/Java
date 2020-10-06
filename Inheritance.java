class GrandParent{
	int k;
}

class Parent extends GrandParent{		// This is single-level inheritance.  Parent --> GrandParent
	int l;
}

class Child extends Parent{				// This is multi-level inheritance.	 Child --> Parent --> GrandParent
	// Child extends Parent means Child shares IS-A relation with Parent.
}

class Child2 extends Parent{			// This is Hierarchical inheritance.   Child --> Parent <-- Child2
	
}

////	MULTIPLE INHERITANCE IS NOT SUPPORTED IN JAVA... 

public class Inheritance {
	public static void main(String[] args) {
		Parent pr = new Parent();			//	Class Inheritance has Objects of Parent and Child class so class Inheritance shares
		Child ch = new Child();				//  HAS-A relation with class Child and Parent.
		
		System.out.println(pr.k = 3);	// k is member of class grandparent which is super class of class parent.(Single level inheritance)
		ch.k=2;		// l is member of class grandparent which is nor directly inherited into child but it can access it because child
		ch.l=5;		// inherits it from parent. (Multilevel Inheritance)
		System.out.println(ch.k+ch.l+pr.k);
		System.out.println("Inherited perfectly!");
	        System.out.println("Inherited perfectly!");

	}
}



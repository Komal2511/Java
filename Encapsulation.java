class Man{
	private int age = 21;
	private String name;
	public void setter(int i , String st) {
		age=i;
		name=st;
	}
	public int ageGetter() {
		return age;
	}
	public String nameGetter() {
		return name;
	}
}
public class Encapsulate {
	public static void main(String[] args) {
		Man m = new Man();
	  //m.age = 20;		     // This is not right way to access variables of other class acc. to OOPS. so encapsulation comes in scene.
	  //m.name ="Om";  		 // We should make varible PRIVATE.
		m.setter(20, "Om");  // and use GETTERS i.e. method to set values of those varibles.
		int age = m.ageGetter();   // and to access values of variables we should use GETTERS i.e. use methods that will return value.
		String name = m.nameGetter();		// SO we are binding varibles with methods. so we called it as data binding or encapsulation.
		System.out.println(age+" "+name);
	}
}

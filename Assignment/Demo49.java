package Assignment;
class Test{
	public void m1() {
	System.out.println("Test Method");
}
}
class Test1 extends Test {
	public void m1() {
		System.out.println("Test1 method");
	}
}

public class Demo49 {
	public static void main(String[] args) {
		//create one method in class Test
		//override that method in Test1 class
		//call that overridden method from here
		Test1 d = new Test1();
		d.m1();
		
		
		//to do this thing do required changes in all these three classes
	}

}


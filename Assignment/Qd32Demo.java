package Assignment;

//In below program, try to call m1 method in different ways
//like with catching returned value,without catching
//returned value,call from expression i.e different 
//ways which will show how to call non void methods
public class Qd32Demo {
	public static int m1(int i){
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method from here in different ways
		int a = Qd32Demo.m1(10);//catching return value.
		System.out.println(a);
		Qd32Demo.m1(10);//Without catching return value
		m1(12);
		
	}


}

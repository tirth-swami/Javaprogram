package Assignment;

public class Qc29Demo {
public static float m1(int i) {
	System.out.println("m1 method called");
	return i*i;
	
}
public static void main(String []args) {
	//call m1 method and pass some number
	Qc29Demo.m1(10);
	int total = (int) (100 + Qc29Demo.m1(10));
	System.out.println(total);
	
}
}

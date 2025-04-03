package Assignment;
//In below example, try to print total variable in different ways which explains different ways to call static variable
public class Qb12Demo {
	private static int total = 10;
	public static void main(String[] args) {
		//print total in different ways
		System.out.println(total);
		System.out.println(Qb12Demo.total);
		Qb12Demo d = new Qb12Demo();
		int a = d.total;
		System.out.println(a);
	}

}

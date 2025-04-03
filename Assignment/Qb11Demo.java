package Assignment;
//In below example ,try to call show method in different ways which explains different ways to call static methods
public class Qb11Demo {
	public static void main(String[] args) {
		//call show method in different ways
		Employee e = new Employee();	
		Qb11Demo d = new Qb11Demo();
		d.show(e);
		show(e);
		Qb11Demo.show(e);
	}
	public static void show(Employee e){
		System.out.println("show method");
	}

}

package Assignment;

public class Q7Demo {
	public static void main(String[] args) {
		//here create two objects of Employee class and add  data into that
		Employee e1 = new Employee(1,"sam",1000);
		Employee e2 = new Employee(2,"ram",2000);
		//call show method and pass this two objects to show method
		Q7Demo.show(e1,e2);
	}
	public static void show(Employee e1,Employee e2){
		//do required changes to show method and display that data here
		System.out.println(e1.id+" "+e1.name+" "+e1.sal);
		System.out.println(e2.id+" "+e2.name+" "+e2.sal);
	}

}

package Assignment;

public class Qc30Demo {
	public static Employee m1(){
		//create Employee object here and return
		Employee e = new Employee(1,"sam",1000);
		
		return e;
		//do required changes in m1 method to do this task
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
	    Employee e = Qc30Demo.m1();
		//display returned employee data here
	    System.out.println(e.id+" "+e.name+" "+e.sal);
	}

}

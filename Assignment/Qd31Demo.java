package Assignment;

public class Qd31Demo {
	public static Object m1(){
		//create Employee object here and return
		Employee e = new Employee(1,"sam",1000);
		 return e;
		//don’t change m1 method prototype i.e return type or access specifier
	}
	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		Employee e = (Employee)Qd31Demo.m1();
		//display returned employee data here
		System.out.println(e.id+" "+e.name+" "+e.sal);
	}

}

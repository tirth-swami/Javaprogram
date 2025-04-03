package Assignment;

public class Qc23Demo {
public static void m1(Employee e) {
	//Display data here
	System.out.println(e.id+" "+e.name+" "+e.sal);
	
}
public static void main(String[] args) {
      //Call m1 method from here
	Employee e = new Employee(1 ,"Sam",1000);
	Qc23Demo.m1(e);
	
}
}

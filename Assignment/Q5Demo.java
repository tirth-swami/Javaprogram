package Assignment;

public class Q5Demo {
	  public static void main(String[] args) {
          //here create object of Employee class and add 101,sam,1000 data into that
		  
		  Employee e = new Employee(101,"Sam",1000);
	        //call show method and pass this created object to show method
		  Q5Demo.show(e);

	}
	public static void show(Employee e){
		//do required changes to show method and display that data here
		System.out.println(e.id+" "+e.name+" "+e.sal);
	}

}

package Assignment;

public class Qd33Demo {
	public static void show(Employee e){
		System.out.println(e.id+" "+e.name+" "+e.sal);
	}
	public static void process(Employee e){
		//adding data into that empty object using process method
		e.id = 1;
		e.name="Sam";
		e.sal = 100;
	}
	public static void main(String[] args) {
		//do required changes in main,process and show method
		//create empty employee object here
		Employee e = new Employee();
		
		//add data into that empty object using process method
		process(e);
		//display employee object with data in show method
		show(e);
	}
	
	

}

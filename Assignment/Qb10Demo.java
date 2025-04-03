
package Assignment;

public class Qb10Demo {
	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		Employee e = new Employee(101,"sam",1000);
		//display this object data by passing to show method
		Qb10Demo d = new Qb10Demo();
		d.show(e);
		System.out.println(e.id+" "+e.name+" "+e.sal);
		//add 100 bonus in salary 
		e.sal= e.sal+100;
		//display this object data by passing to show method
		System.out.println(e.id+" "+e.name+" "+e.sal);
	}
	public void show(Employee e){
		//do required changes in show method
	}

}

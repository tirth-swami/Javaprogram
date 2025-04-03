package Assignment;
//4. public class Demo {
//	   public static void main(String[] args) {
//		//here create object of Employee class and add 101,sam,1000 data into that using constructor
//		//display that data here
//	   }
//	}

public class Q4Demo {
	public static void main(String[] args) {
		Employee e = new Employee(1,"sam",100);
		System.out.println(e.id + " "+ e.name+" "+e.sal);
	}



}

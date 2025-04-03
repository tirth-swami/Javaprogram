package Assignment;
import java.util.Scanner;

public class Qd34Demo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//take data id,name,salary from user using scanner and display that data in show method
		System.out.println("Enter eid");
	    
	    
		System.out.println("Enter eid");
		
		
		System.out.println("Enter eid");
		
		Qd34Demo d = new Qd34Demo();
		d.show(sc);
		
	}

	public void show(Scanner sc){
		//display data here by doing required changes
		int id = sc.nextInt();
	String name = sc.nextLine();
	int sal = sc.nextInt();
	
	System.out.println(id +" "+name+" "+sal);
	}
	

}

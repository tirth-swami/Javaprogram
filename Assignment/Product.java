package Assignment;
//Create Product class with fields id,name and price and create Product object and store data and display that data.
public class Product {
 int id;
 String name;
 int price;
 public static void main(String[] args) {
	Product p = new Product();
	p.id =1;
	p.name = "Pen";
	p.price = 10;
	System.out.println(p.id + " "+p.name+" " + p.price);
 }
 }
 

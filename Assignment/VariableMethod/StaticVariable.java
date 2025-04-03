package Assignment.VariableMethod;
//Take one static variable which will hold 10.5 value and display that value in the main method.
//Write a program which will explain to me three ways to use static variables.
public class StaticVariable {
  static double d = 10.5;
  public static void main(String[] args) {
	System.out.println(d);//1st way
	System.out.println(StaticVariable.d);//2nd way
	StaticVariable s = new StaticVariable();
	System.out.println(s.d);//3rd way
}
}

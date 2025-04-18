class ConditionalUpc
{
	public static void main(String[] args)
	{
	  char ch = 'a';
	  String op = ((ch>=65 && ch<=90)||(ch>=97 && ch <= 122))? ((ch>=65 && ch<=90)?(ch+"is Uppercase"):(ch+" is lowercase")):  //oper2

	  ((ch>=48 && ch<=57)?(ch+"  is digit"):(ch+" is special character"));//operand 3
           
           System.out.println(op);
	  

	}
}
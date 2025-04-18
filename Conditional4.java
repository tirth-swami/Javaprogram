class Conditional4
{
	public static void main(String[] args)
	{
	  int n1 = 238;
	  int n2 = 3299;
	  int n3 = 34;

	  int large = n1>n2 ?( n1>n3? n1:n3): (n2>n3? n2:n3);
	  System.out.println(large);

	}
}
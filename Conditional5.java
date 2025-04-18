class Conditional5
{
	public static void main(String[] args)
	{
	 int n1 = 3232;
	 int n2 = 32;
	 int n3 = 35;

	 // int small =  n1<n2 ?(n1< n3 ? n1:n3): (n2< n3 ? n2:n3);

	 // System.out.println(small);


	 // int smaller = (n1<n2? n1:n2)<n3 ? (n1<n2?n1:n2):n3;
	 // System.out.println(smaller);

	 int smallest = n1< (n2<n3? n2:n3)?n1:(n2<n3?n2:n3);

	 System.out.println(smallest);
	  


	}
}
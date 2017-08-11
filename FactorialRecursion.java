package augustExamples;

public class FactorialRecursion {
	static int factorial(int n)
	{
		if (n==0)
		{
			return 1;
		}
		else
		return (n*(factorial(n-1)));  	
	}
	
	public static void main(String[] args)
		{
			int j=5,k;
			k = factorial(j);
			System.out.println(k);
		}

}



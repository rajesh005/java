package augustExamples;

public class ArrayOddEven {

	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[]= new int[5];
		int c[]= new int[5];
		int i,j=0,k=0;
		
		for(i=0; i <a.length; i=i+1 )
		{
			if(a[i] % 2==0)
			{
			System.out.println("even");	
			b[j]=a[i];
			j++; 
			}
			else
			{
				System.out.println("odd");		
			c[k]=a[i];
			k++;
			}
		}
		for (j=0;j<b.length;j++)
		{
		System.out.println(b[j]);
		}
		for (j=0;j<c.length;j++)
		{
		System.out.println(c[j]);}
	}
	
}

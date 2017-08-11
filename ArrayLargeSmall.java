package augustExamples;

public class ArrayLargeSmall {
public static void main(String[] args)
{ 
	
	 int[] a= {7,5,9,6,8,1,3,10,2,4};
	 int smallest = a[0];
	 int largest = a[0];
	 int j;
	 for(j=1;j<a.length;j++)
	 {
		 if (a[j]<smallest)
			 smallest=a[j];
		 if (a[j]>largest)
			 largest=a[j]; 
	 }
	
	 System.out.println(smallest);
	 System.out.println(largest);
	 

}
}

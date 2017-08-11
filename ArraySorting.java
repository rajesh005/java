package augustExamples;

import java.util.Arrays;

public class ArraySorting 
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {9,6,8,10,5,11,22};
		
		
		Arrays.sort(arr);
		for (int i = 0; i<7; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}

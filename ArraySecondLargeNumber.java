package augustExamples;

public class ArraySecondLargeNumber 
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		for (int i = 0; i<10; i++)
		{
			arr[i] = i+1;
		}
		int highest = Integer.MIN_VALUE;
		int SecondHighest = Integer.MIN_VALUE;
		for (int i = 0; i<10; i++)
		{	if (arr[i] > highest)
				{
					SecondHighest = highest;
					highest = arr[i];
				}
			else if (arr[i] > SecondHighest)	
				{
					SecondHighest = arr[i];
				}
		}
		System.out.println(SecondHighest);
	}
}


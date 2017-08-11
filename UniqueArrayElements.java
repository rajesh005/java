package augustExamples;

public class UniqueArrayElements 
{
	public static void main(String[] args)
	{
		int arr[] = new int[] {6,2,1,3,3,4,5,5,1,2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++){
		    boolean isDistinct = false;
		    for(int j=0;j<i;j++){
		        if(arr[i] == arr[j]){
		            isDistinct = true;
		            break;
		        }
		    }
		    if(!isDistinct){
		        System.out.print(arr[i]+" ");
		    }

}
}
}
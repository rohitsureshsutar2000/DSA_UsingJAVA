package sortingAlgos;
import java.util.Arrays;

public class TestMargeSort {

	public static void main(String[] args) {
		int[] arr= {65,35,26,31,33,12,91};
		int start=0;
		int end=arr.length-1;
		margesort(arr,start,end);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void margesort(int[] arr, int start, int end) {
		if (start<end)
		{
			int mid=(start+end)/2;
			margesort(arr,start,mid);
			margesort(arr,mid+1,end);
			marge(arr,start,end,mid);
		}
		
	}

	private static void marge(int[] arr, int start, int end, int mid) {
		int i,j,k;
		
		int n1=mid-start+1;
		int n2=end-mid;
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		
	for(i=0;i<n1;i++)
		{
			leftarr[i]=arr[start+i];
		}
		for(i=0;i<n2;i++)
		{
			rightarr[i]=arr[mid+1+i];
		}
		
		i=0;
		j=0;
		k=start;
		while(i<leftarr.length && j<rightarr.length)
		{
			if(leftarr[i]<rightarr[j])
			{
				arr[k]=leftarr[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=rightarr[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rightarr[j];
			j++;
			k++;
		
		}
		
	}

}

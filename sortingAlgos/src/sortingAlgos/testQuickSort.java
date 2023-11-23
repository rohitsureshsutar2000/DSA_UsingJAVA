package sortingAlgos;

import java.util.Arrays;

public class testQuickSort {

	public static void main(String[] args) {
		int[] arr= {54,26,93,17,77,31,44,55,20};
		int start=0;
		int end=arr.length-1;
		quickSort(arr,start,end);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start<end)
		{
			int p=partition(arr,start,end);
			quickSort(arr,start,p-1);
			quickSort(arr,p+1,end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot=start;
		int i=start;
		int j=end;
		
		while(i<j)
		{
			while(i<end && arr[i]<arr[pivot])
			{
				i++;
			}
			while(j>pivot && arr[j]>arr[pivot])
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//swapping the pivot with j
		int temp=arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		
		
		return j;
	}

}

package CH7_Algo;

public class Search_Sort { 
	
	public int Bin_rec(int[] a, int bottom, int top, int val)
	{
		//index start from 0
		if(bottom <= top) 
		{
			int mid = (bottom + top)/2;
			
			if(val == a[mid]) return mid;
			else if (val < a[mid]) {
				return Bin_rec(a, bottom, mid-1, val);
			}
			else {
				return Bin_rec(a, mid+1, top, val);
			}
		}
		return -1;
	}
	
	public int Bin_iter(int[] a, int size, int val) 
	{
		int mid = 0;	
		int bottom = 0;	int top = size - 1;
		while(bottom <= top)
		{
			System.out.printf("Binary Search: bottom: %d, top: %d\n", bottom, top);
			mid = (top + bottom)/2;
			if(val == a[mid]) return mid;
			else if (val < a[mid]) top = mid - 1;
			else bottom = mid + 1;
		}
		return mid;
	}
	
	//Sorting
	//--------------------------------------------------------------
	//--------------------------------------------------------------
	/*
	 * Simple sort：Insertion Sort, Selection Sort, Buuble Sort
	 * Average Time: O(n^2)
	 */

	public static void insert(int[] a, int data, int i)
	{
		int j = i;
		while((j > -1) && data < a[j])
		{
			a[j+1] = a[j];
			j--;
		}
		a[j+1] = data;
	}
	
	public static void insort(int[] a, int n)
	{
		for(int i=1; i<n; i++)
		{
			insert(a, a[i], i-1);
		}
	}
	
	public static void Selection(int[] a, int n)
	{
		for (int i = 0; i < n-1; i++) {
			int min = i;
			for (int j = i+1; j < n; j++) {
				if(a[min] > a[j])	min = j;
			}
			if (min != i) SWAP(a, i, min);
		}
	}
	
	//Swap index of array
	private final static void SWAP(int[] arr, int i, int j)
	{
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void BubbleSort(int[] a, int n)
	{
		for (int i = 1; i <= n; i++) {
			int f = 0;
			for (int j = 0; j < n-i; j++) {
				if(a[j] > a[j+1])
				{
					SWAP(a, j, j+1);
					f = 1;
				}
			}
			System.out.print("Present array sequence: ");
			for (int j = 0; j < n; j++) {
				System.out.print(a[j] + ", ");
			}
			System.out.println();
			if(f == 0) 
			{
				System.out.printf("break position: %d\n", i);
				break;
			}
		}
	}
	
	public void Quicksort(int[] a, int leftest, int rightest) 
	{
		if(leftest < rightest)
		{
			int pk = a[leftest];
			int i = leftest;
			int j = rightest+1;
			
			do {
				do {
					i += 1;
				} while (!(a[i] >= pk) && i < rightest);
				
				do {
					j -= 1;
				} while (!(a[j] <= pk) && j > leftest);
				if(i < j) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
				
			} while (!(i >= j));
			int tmp = a[leftest];
			a[leftest] = a[j];
			a[j] = tmp;
			Quicksort(a, leftest, j-1);
			Quicksort(a, j+1, rightest);
		}
	}
}

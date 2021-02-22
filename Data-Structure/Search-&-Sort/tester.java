package CH7_Algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class tester {
	public static void main(String[] args) throws IOException {
		
		Random randomnum = new Random();
		int[] arr = new int[20];
		
		System.out.println("---Random---");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomnum.nextInt(100);
			System.out.print(arr[i] +", ");
		}
		
		System.out.println();
		System.out.println();
		
		Search_Sort s1 = new Search_Sort();
		s1.Quicksort(arr, 0, arr.length-1);
		
		System.out.println("---Quicksort---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +", ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("---Binary Search---");
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter the number: (Exit: -1): ");
		int val = Integer.parseInt(bReader.readLine());
		
		while (val != -1) {
			System.out.printf("Binary Search(%d) position: %d\n", val, 
								s1.Bin_rec(arr, 0, arr.length-1, val));
			
			System.out.print("Please enter the number: (Exit: -1): ");
			val = Integer.parseInt(bReader.readLine());
		}
		
		//System.out.println(a1.Bin_iter(arr, 10, 5));
		
		System.out.println();
		
		System.out.println("---Insertion Sort---");
		int[] a1 = { 1, 5, 2, 6, 8, 3, 9, 4, 7 };
		Search_Sort.insort(a1, a1.length);
		
		for (int i = 0; i < a1.length; i++) {
			
			System.out.print(a1[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("---Selection Sort---");
		int[] a2 = { 1, 5, 2, 6, 8, 3, 9, 4, 7 };
		Search_Sort.Selection(a2, a2.length);
		
		for (int i = 0; i < a2.length; i++) {
			
			System.out.print(a2[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("---Bubble Sort---");
		int[] a3 = { 1, 5, 2, 6, 8, 3, 9, 4, 7 };
		
		
		System.out.print("Initial array sequence: ");
		
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		
		Search_Sort.BubbleSort(a3, a3.length);
	}
}

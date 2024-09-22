//unfinfished

import java.io.*;
import java.lang.*;
import java.util.*;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int array[] = new int[100];
		int n, i;
		System.out.print("Enter number of elements: ");
		n = s.nextInt();
		System.out.print("\nEnter " + n + " integers : ");
		for (i = 0; i < n; i++) {
			array[i] = s.nextInt();
		}
		int result[] = new int[n];
		result = Bubble(array, n);

		System.out.println("Before sorting\n");
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("After sorting\n");

		for (i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

	static int[] Bubble(int[] array, int n) {
		int i, j;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					array[j] += array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] -= array[j + 1];
				}
			}
		}
		return (array);
	}
}

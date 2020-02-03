import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

	public int[] sortArray(int[] arr) {
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = true;
				}
			}
		}
		return arr;
	}

	// public int occurance (int [] arr){
	// int prevcount = 0;
	// int newcount = 0;
	// int selected = 0;
	// int ret = 0;
	// for (int i=0; i < arr.length-1; i++){
	// int num = arr[i];
	// prevcount = 0;
	// for (int j=0; j < i; j++){
	// if (num == arr[j]){
	// prevcount++;
	// selected = num;
	// }
	// }
	// if (prevcount > newcount){
	// newcount = prevcount;
	// ret = selected;
	// }
	// else {
	// int sortedArray[] = new int [arr.length];
	// sortedArray = sortArray (arr);
	// ret = sortedArray[arr.length-1];
	// }
	// }
	// return ret;
	// }

	public static double mean(int[] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		return sum / m.length;
	}

	// the array double[] m MUST BE SORTED
	public static double median(int[] m) {
		int middle = m.length / 2;
		if (m.length % 2 == 1) {
			return m[middle];
		} else {
			return (m[middle - 1] + m[middle]) / 2.0;
		}
	}

	public static int mode(int a[]) {
		int maxValue = 0, maxCount = 0;

		for (int i = 0; i < a.length; ++i) {
			int count = 0;
			for (int j = 0; j < a.length; ++j) {
				if (a[j] == a[i])
					++count;
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = a[i];
			}
		}

		return maxValue;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Solution2 s = new Solution2();
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int arr[] = new int[count];
		double mean = 0.0;
		for (int i = 0; i < count; i++) {
			arr[i] = scan.nextInt();
		}

		// for (int j= 0; j <count; j++){
		// mean += arr[j];
		// }

		System.out.println(s.mean(arr));
		int sortedArray[] = new int[count];
		sortedArray = s.sortArray(arr);
		System.out.println(s.median(sortedArray));
		System.out.println(s.mode(arr));

		// int sortedArray[] = new int [count];
		// sortedArray = s.sortArray (arr);
		// double med1=0.0;
		// double med2=0.0;
		// int index = count/2;
		// med1 = sortedArray[index];
		// med2 = sortedArray[index-1];
		// double med3 = med1 + med2;
		// double median = med3/2;
		// System.out.println (median);
		//
		// int mode = s.occurance(arr);
		// System.out.println (mode);

	}
}
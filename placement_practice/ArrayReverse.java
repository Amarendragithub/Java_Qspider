package placement_practice;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] ar = { 10, 20, 30, 40 };
		int i = 0, j = ar.length - 1, temp;

		while (i < j) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;
		}

		System.out.println(Arrays.toString(ar));
	}

}
